<script>
import CitiesList from '@/views/CitiesList.vue'

export default {
  name: 'App',
  methods: {
    onListClick() {
      // Affiche une alerte lorsque l'utilisateur clique sur l'élément
      alert('Vous avez cliqué sur la liste !')
    },
    isLoginPage(){
      let path = window.location.pathname.split('/')[1]
      if(path !== '/'){
        return true
      }
      return false
    }

  }
}
</script>

<template>

  <div>
    <h1>Bienvenue dans l'application</h1>

    <ul>
      <li @click="onListClick">Cliquez ici pour une alerte</li>
      <li><router-link to="/villes"  > meteo site officiel</router-link></li>
    </ul>

<!-- <router-link to="/CHEMIN_ROUTE(nom au choix)" > pour passer d'une page à l'autre dans le même composant.-->

    <button v-show="$route.path!=='/'" @click="$router.go(-1)">Back</button>

    <RouterView />
    <!-- </router-view> affiche le contenu de la route correspondant au composant spécifié dans la déclaration.-->
  </div>

</template>

<style scoped>
header {
  line-height: 1.5;
  max-height: 100vh;
}

.logo {
  display: block;
  margin: 0 auto 2rem;
}

nav {
  width: 100%;
  font-size: 12px;
  text-align: center;
  margin-top: 2rem;
}

nav a.router-link-exact-active {
  color: var(--color-text);
}

nav a.router-link-exact-active:hover {
  background-color: transparent;
}

nav a {
  display: inline-block;
  padding: 0 1rem;
  border-left: 1px solid var(--color-border);
}

nav a:first-of-type {
  border: 0;
}

@media (min-width: 1024px) {
  header {
    display: flex;
    place-items: center;
    padding-right: calc(var(--section-gap) / 2);
  }

  .logo {
    margin: 0 2rem 0 0;
  }

  header .wrapper {
    display: flex;
    place-items: flex-start;
    flex-wrap: wrap;
  }

  nav {
    text-align: left;
    margin-left: -1rem;
    font-size: 1rem;

    padding: 1rem 0;
    margin-top: 1rem;
  }
}
</style>
