<script>
import axios from 'axios';
import ProductCard from "@/components/ProductCard.vue";

export default {
  name: 'ProductCatalog',
  components: { ProductCard },
  data() {
    return {
      apiUrl: "http://localhost:8000/api/products",
      product: {},
    };
  },
  methods: {
    getImagePath(productName) {
      return this.images[productName] || 'ProductsAsset/default.jpg'; // Image par défaut si non trouvée
    }
  },
  mounted() {
    const route = this.$route; // Accéder à la route via this.$route
    const id = parseInt(route.params.id);
    console.log(id);

    axios
        .get(`http://localhost:8000/api/products/${id}`) // Utiliser des backticks pour inclure la variable `id`
        .then(response => {
          this.product = response.data; // Mettre à jour le produit avec la réponse de l'API
          console.log(this.product);
        })
        .catch(error => {
          console.error('Erreur lors de la récupération des produits:', error);
        });
  }
};
</script>

<template>
  <div class="catalog">
    <div class="product-card">
      <ProductCard :product="product" :url="apiUrl" :key="product.id" />
    </div>
  </div>
  <div class="back">
    <p>Revenir en arrière</p>
    <button v-show="$route.path!=='/'" @click="$router.go(-1)">Back</button>
  </div>
</template>

<style scoped>
.catalog {
  display: flex;
  flex-wrap: wrap;
  gap: 5rem;
  justify-content: center;
  align-items: center;
  max-width: 1200px;
  margin: auto;
  height: 58vh;
}
.product-card {
  display: flex;
  align-items: center;
  background-color: #fff;
  border: 1px solid #ddd;
  border-radius: 8px;
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
  overflow: hidden;
  text-align: center;

  min-height: 40vh;
}

.product-info {
  padding: 10px;
}

.product-nom {
  font-size: 1.2em;
  margin: 10px 0;
  color: #555;
}

.product-description {
  font-size: 0.9em;
  color: #555;
}

.product-price {
  font-size: 1.1em;
  color: #333;
  margin: 10px 0;
}

.product-quantite {
  font-size: 1.1em;
  color: #333;
  margin: 10px 0;
}
</style>
