<script>
export default {
  name: 'CitiesList',
  data() {
    return{
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
    };
  }
}
</script>


<template>
  <div class="CitiesList">
    <h1>Météo-liste des villes</h1>


      <ul>
        <li v-for="(city, index) in cities" :key="index">
          <h2>{{city.name}}</h2>
          <p>id: {{ city.id }}</p>
          <P>weather: {{city.weather}}</P>
          <p>Température: {{ city.temperature }}°C</p>
          <p>updatedAt: {{ city.updatedAt }}</p>

        </li>
      </ul>
    </div>

</template>

<style>
.CitiesList h1{
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
