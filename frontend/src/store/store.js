import { reactive } from "vue";
import axios from "axios";

const state = reactive({
  contacts: [],
  contact: {
    name: ""
  },
});

const methods = {
  async fetchContacts() {
    await axios.get("http://localhost:8080").then((response) => {
      state.contacts = response.data;
    });
  },

  async addContact(contact) {
    if (state.contact.name.trim() !== "") {
      await axios.post("http://localhost:8080/addContact", contact);
      await this.fetchContacts();
    }
  },

  async deleteContact(id) {
    await axios.delete(`http://localhost:8080/deleteContact/${id}`);
    await this.fetchContacts();
  },
};

export default {
  state,
  methods,
};
