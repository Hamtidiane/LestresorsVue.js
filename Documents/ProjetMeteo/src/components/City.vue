
<template>
  <div>
    <h3>{{ name }}</h3>
    <p>Météo : {{ weather }}</p>
    <p>Température : {{ temperature }} °C</p>
    <p>Dernière mise à jour : {{ formattedDate }}</p>
  </div>
</template>

<script>

import { format } from 'timeago.js';
export default {
  name: 'City',
  props: {
    name: {
      type: String,
      required: true
    },
    weather: {
      type: String,
      required: true
    },
    temperature: {
      type: Number,
      required: true
    },
    updatedAt: {
      type: Date,
      required: true
    }
  },

  computed: {
    formattedDate() {
      // Utilisation de timeago.js pour formater la date en format relatif
      return format(this.updatedAt);
    }
  },
}

</script>

<style scoped>
h3 {
  font-family: Arial, sans-serif;
  color: #333;
}

p {
  font-family: Arial, sans-serif;
  color: #555;
}
</style>
