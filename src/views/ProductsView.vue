<script>
import axios from 'axios';
import ProductCard from "@/components/ProductCard.vue";
import router from "@/router/index.js";

export default {
  components: {ProductCard},
  data() {
    return {

      apiUrl: "http://localhost:8000/api",
      products: [], // Initialiser la liste des produits vide
    };
  },
  methods: {
    getImagePath(productName) {
      return this.images[productName] || 'ProductsAsset/default.jpg'; // Image par défaut si non trouvée
    },
    handleClick(productId) {
      router.push({ name: "product-one-view", params: {id: productId} });
      console.log(productId);
    },
  },

  mounted() {
    // Faire une requête GET à Laravel pour récupérer les produits
    axios
        .get('http://localhost:8000/api/products')
        .then(response => {
          console.log(this.apiUrl);
          this.products = response.data; // Mettre à jour la liste des produits avec la réponse de l'API
        })
        .catch(error => {
          console.error('Erreur lors de la récupération des produits:', error);
        });
  },
  filters: {
    currency(value) {
      return `$${value.toFixed(2)}`;
    },
  },
};
</script>

<template>
  <div class="catalog">
    <template v-for="product in products" :key="product.id">
      <div  class="product-card" @click="handleClick(product.id)">
        <ProductCard :product="product" :url="apiUrl" :key="product.id" />
      </div>
    </template>
  </div>
</template>

<style scoped>
.catalog {
  display: flex;
  flex-direction: row;
  flex-wrap: wrap;
  gap: 5rem;
  justify-content: space-evenly;
max-width: 1200px;
  margin: auto;

}
.product-card {
  background-color: #fff;
  border: 1px solid #ddd;
  border-radius: 8px;
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
  width: 305px;
  text-align: center;
}

</style>