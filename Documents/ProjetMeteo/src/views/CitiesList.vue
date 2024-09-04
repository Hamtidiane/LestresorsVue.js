<script>
import City from '@/components/City.vue'

export default {
  name: 'CitiesList',
  components: { City },
  data() {
    return {
      cities: [
        {
          id: 1,
          name: 'Ville 1',
          weather: 'Ensoleillé',
          temperature: 22.0,
          updatedAt: new Date()
        },
        {
          id: 2,
          name: 'Ville 2',
          weather: 'Peu nuageux',
          temperature: 19.5,
          updatedAt: new Date()
        }
      ]
    }
  }
}
</script>

<template>
  <div>
    <h2>Liste des Villes</h2>
    <ul>
      <li v-for="city in cities" :key="city.name">
        <!-- Appel du composant City pour chaque ville -->
        <City :name="city.name" :weather="city.weather" :temperature="city.temperature" :updatedAt="city.updatedAt" />
      </li>
    </ul>
  </div>
</template>



<style>
.CitiesList h1 {
  display: flex;
}
h1 {
  text-align: center;
}

ul {
  list-style-type: none;
  padding: 0;
}

li {
  border: 1px solid #ddd;
  margin: 10px;
  padding: 10px;
  border-radius: 5px;
}

h2 {
  margin: 0;
}

p {
  margin: 5px 0;
}
@media (min-width: 1024px) {
  .about {
    min-height: 100vh;
    display: flex;
    align-items: center;
  }
}
</style>
