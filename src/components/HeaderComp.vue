<template>
  <header class="site-header">
    <div class="header-top">
      <div class="search-bar">
        <input type="text" v-model="searchQuery" placeholder="Rechercher un produit..." />
        <button @click="searchProduct">Rechercher</button>
      </div>


      <div class="header-actions">
        <router-link to="/cart" class="cart-link">
          <span class="cart-icon">🛒</span>
          <span class="cart-count">{{ cartItemCount }}</span>
        </router-link>
        <router-link to="/login" class="login-link">
          Connexion
        </router-link>
        <router-link to="/inscription" class="inscription-link">
          Inscription
          </router-link>/
      </div>
    </div>

    <div class="logo">

      <img src="/ProductsAsset/logo.png" alt="Logo Produits Savoyards" />
    </div>


    <nav class="header-nav">
      <ul>
        <li><router-link to="/">Accueil</router-link></li>
        <li><router-link to="/products">Nos produits</router-link></li>
        <li><router-link to="/about">À propos</router-link></li>
        <li><router-link to="/contact">Contact</router-link></li>
      </ul>
    </nav>
  </header>
</template>

<script>
export default {
  name: 'HeaderComponent',
  data() {
    return {
      searchQuery: '', // Pour la barre de recherche
      cartItemCount: 0, // Nombre d'articles dans le panier
    };
  },
  methods: {
    searchProduct() {
      if (this.searchQuery) {

        this.$router.push({ name: 'ProductSearch', query: { q: this.searchQuery } });
      }
    },
  },
  mounted() {

    this.cartItemCount = 3; // Exemple : 3 articles dans le panier
  },
};
</script>

<style scoped>

.site-header {
  background-color: #f5f5f5;
  padding: 10px 20px;
  border-bottom: 2px solid #ccc;
  display: flex;
  flex-direction:row-reverse ;
  justify-content: space-between;
}

.header-top {
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.logo img {
  max-width: 150px;
}

.search-bar {
  display: flex;
  align-items: center;
}

.search-bar input {
  padding: 5px;
  margin-right: 10px;
  border: 1px solid #ccc;
  border-radius: 4px;
}

.search-bar button {
  padding: 5px 10px;
  background-color: #4CAF50;
  color: white;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

.search-bar button:hover {
  background-color: #45a049;
}

.header-actions {
  display: flex;
  align-items: center;
}

.cart-link {
  margin-right: 15px;
  font-size: 1.5rem;
  position: relative;
}

.cart-icon {
  font-size: 1.8rem;
}

.cart-count {
  position: absolute;
  top: -5px;
  right: -10px;
  background-color: red;
  color: white;
  padding: 0 6px;
  border-radius: 50%;
  font-size: 0.8rem;
}

.login-link {
  font-size: 1rem;
  color: #333;
}
.inscription-link {
  font-size: 1rem;
  color: #333;
}

.header-nav {
  background-color: #333;
  padding: 10px 0;
  margin-top: 10px;

}

.header-nav ul {
  list-style: none;
  display: flex;
  justify-content: center;
}

.header-nav ul li {
  margin: 0 15px;
}

.header-nav ul li a {
  color: white;
  text-decoration: none;
}

.header-nav ul li a:hover {
  text-decoration: underline;
}
</style>
