<template>
  <div>
    <form method="POST">
      <label class="form-label mt-2" for="name">Name <span class="red">(required)</span></label>
      <input v-model="store.state.contact.name" class="form-control" type="text"/>

      <label class="form-label mt-2" for="email">Email</label>
      <input v-model="store.state.contact.email" class="form-control" type="email" />

      <label class="form-label mt-2" for="phone">Phone</label>
      <input v-model="store.state.contact.phone" class="form-control" type="tel" />

      <button class="btn btn-primary btn-sm mt-2" 
      @click.prevent="store.methods.addContact(store.state.contact)">
        Add contact
      </button>
    </form>
  </div>
</template>

<script>
import { inject } from "vue";
export default {
  setup() {
    const store = inject('store');
    return {store};
  },
};
</script>

<style>
.red{
  color: red;
}


</style>
