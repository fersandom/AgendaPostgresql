<template>
  <div class="container">
    <Header />
    <AddContactForm/>
    <div class="mt-2">
      <table class="table table-striped">
        <thead class="">
          <tr>
            <td>Name</td>
            <td>Email</td>
            <td>Phone</td>
            <td>Delete</td>
          </tr>
        </thead>
        <tbody>
          <tr v-for="contact in store.state.contacts" :key="contact.id">
            <td>{{ contact.name }}</td>
            <td>{{ contact.email }}</td>
            <td>{{ contact.phone }}</td>
            <td><button @click.prevent="store.methods.deleteContact(contact.id)" class="btn btn-sm btn-danger">X</button></td>
          </tr>
        </tbody>
      </table>
    </div>
  </div>
</template>

<script>
import Header from "./components/Header.vue";
import AddContactForm from "./components/AddContactForm";
import { onBeforeMount, provide } from "vue";
import store from "./store/store";
export default {
  components: {
    Header,
    AddContactForm
  },
  setup() {
    provide("store", store);

    onBeforeMount(() => {
      store.methods.fetchContacts();
    });

    return { store };
  },
};
</script>

<style></style>
