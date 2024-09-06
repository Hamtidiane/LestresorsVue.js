<script>
export default {
  props: {
    product: {
      type: Object, // Attendre un objet produit
      required: true
    },
    url: {
      type: String, // URL de l'API
      required: true
    },
    key: {
      type: String,
      required: true
    }
  },
  data() {
    return {
      id: this.key,
    };
  },
  methods: {
    getImagePath(productName) {
      // Fonction pour obtenir l'image associée au produit ou une image par défaut
      const images = {
        'Reblochon': '/ProductsAsset/reblochon.jpg',
        'Tomme de Savoie': '/ProductsAsset/tomme.jpg',
        'Diots': '/ProductsAsset/diot.jpg',
        'Vins de Savoie': '/ProductsAsset/vin.jpg',
        'Crozet': '/ProductsAsset/crozet.jpg',
        'Miel de Savoie': '/ProductsAsset/miel.jpg'
      };
      return images[productName] || 'ProductsAsset/default.jpg';
    },
  }
};
</script>

<template>

    <img :alt="product.nom" :src="getImagePath(product.nom)" class="product-image" />
      <div class="product-info">
        <h3 class="product-nom">{{ product.nom }}</h3>
        <p class="product-description">{{ product.description }}</p>
        <p class="product-price">Prix : {{ product.prix }} €</p>
        <p class="product-quantite">Quantité : {{ product.quantite }}</p>
      </div>

</template>

<style scoped>
.product-image {
  width: 300px;
  height: 275px;
  object-fit: cover;
  overflow: hidden;
  border-radius:10px;
}

.product-info {
  padding: 10px;
}

.product-nom{
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