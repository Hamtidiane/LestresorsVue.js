

<script>
import axios from 'axios';

export default {
  data() {
    return {
      user: {
        name: '',
        lastname: '',
        birthday: '',
        gender: 'M',
        phone: '',
        address: '',
        address2: '',
        zipcode: '',
        town: '',
        country: '',
        email: '',
        password: ''
      },
      dataToSend: null,
      passwordConfirmation: '',
      errorMessage: ''
    };
  },
  methods: {
    submitForm() {
      // Vérification que les mots de passe correspondent

      if (this.user.password == this.passwordConfirmation) {
        this.errorMessage = 'Les mots de passe ne correspondent pas.';
        return;
      }

      // Réinitialiser le message d'erreur
      this.errorMessage = '';
      this.dataToSend = JSON.parse(JSON.stringify(this.user));
      console.log(this.dataToSend);
          // Envoyer les données à l'API (remplacez l'URL par celle de votre backend)
      axios
          .post('http://127.0.0.1:8000/api/users', this.dataToSend)
          .then((response) => {
            alert('Utilisateur créé avec succès !');
            this.resetForm();
            console.log(response);
          })
          .catch((error) => {
            console.error('Erreur lors de la création de l\'utilisateur:', error);
            console.log('Détails de l\'erreur:', error.response.data);  // Ajoutez cette ligne
            this.errorMessage = 'Une erreur est survenue lors de la création de l\'utilisateur.';
          });
    },
    resetForm() {
      this.user = {
        name: '',
        lastname: '',
        birthday: '',
        gender: 'M',
        phone: '',
        address: '',
        address2: '',
        zipcode: '',
        town: '',
        country: '',
        email: '',
        password: ''
      };
      this.passwordConfirmation = '';
    }
  }
};
</script>
<template>
  <div class="user-form">
    <h2>Créer un nouvel utilisateur</h2>

    <form @submit.prevent="submitForm">
      <div>
        <label for="name">Prénom :</label>
        <input type="text" v-model="user.name" id="name" required />
      </div>

      <div>
        <label for="lastname">Nom :</label>
        <input type="text" v-model="user.lastname" id="lastname" required />
      </div>

      <div>
        <label for="birthday">Date de naissance :</label>
        <input type="date" v-model="user.birthday" id="birthday" required />
      </div>

      <div>
        <label for="gender">Genre :</label>
        <select v-model="user.gender" id="gender" required>
          <option value="M">Homme</option>
          <option value="F">Femme</option>
          <option value="O">Autre</option>
        </select>
      </div>

      <div>
        <label for="phone">Téléphone :</label>
        <input type="tel" v-model="user.phone" id="phone" required />
      </div>

      <div>
        <label for="address">Adresse :</label>
        <input type="text" v-model="user.address" id="address" required />
      </div>

      <div>
        <label for="address2">Complément d'adresse :</label>
        <input type="text" v-model="user.address2" id="address2" />
      </div>

      <div>
        <label for="zipcode">Code postal :</label>
        <input type="text" v-model="user.zipcode" id="zipcode" required />
      </div>

      <div>
        <label for="town">Ville :</label>
        <input type="text" v-model="user.town" id="town" required />
      </div>

      <div>
        <label for="country">Pays :</label>
        <input type="text" v-model="user.country" id="country" required />
      </div>

      <div>
        <label for="email">Email :</label>
        <input type="email" v-model="user.email" id="email" required />
      </div>

      <div>
        <label for="password">Mot de passe :</label>
        <input type="password" v-model="user.password" id="password" required />
      </div>

      <div>
        <label for="password_confirmation">Confirmer le mot de passe :</label>
        <input type="password" v-model="passwordConfirmation" id="password_confirmation" required />
      </div>

      <div v-if="errorMessage" class="error">
        {{ errorMessage }}
      </div>

      <button type="submit">Créer l'utilisateur</button>
    </form>
  </div>
</template>
<style scoped>
form{
  width: 100%;
  display: flex;
  flex-wrap: wrap;
  justify-content: space-between;
}
form>div{
  width: 49%;
}
.user-form {
  max-width: 600px;
  margin: 0 auto;
}

form div {
  margin-bottom: 15px;
}

label {
  display: block;
  margin-bottom: 5px;
  color:#000000;
}

input, select, button {
  width: 100%;
  padding: 10px;
  border: 1px solid #000;
  border-radius: 4px;
}

.error {
  color: red;
  margin-top: 10px;
}

button {
  background-color: #4CAF50;
  color: white;
  cursor: pointer;
}

button:hover {
  background-color: #45a049;
}
</style>
