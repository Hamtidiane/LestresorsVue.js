<template>
  <div>
    <h1>Données Météorologiques</h1>
    <ul>
      <li v-for="(ville, index) in villes" :key="index">
        <h2>{{ ville.nom }}</h2>
        <p>Température: {{ ville.temperature }}°C</p>
        <p>Humidité: {{ ville.humidite }}%</p>
        <p>Conditions: {{ ville.conditions }}</p>
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  data() {
    return {
      villes: [
        { nom: 'Paris', temperature: 18, humidite: 70, conditions: 'Nuageux' },
        { nom: 'Londres', temperature: 15, humidite: 80, conditions: 'Pluvieux' },
        { nom: 'New York', temperature: 22, humidite: 60, conditions: 'Ensoleillé' },
        { nom: 'Tokyo', temperature: 25, humidite: 75, conditions: 'Clair' },
        { nom: 'Sydney', temperature: 20, humidite: 65, conditions: 'Venté' },
        { nom: 'Moscou', temperature: 10, humidite: 85, conditions: 'Neige' },
        { nom: 'Berlin', temperature: 17, humidite: 68, conditions: 'Nuageux' },
        { nom: 'Rio de Janeiro', temperature: 28, humidite: 78, conditions: 'Ensoleillé' },
        { nom: 'Le Caire', temperature: 30, humidite: 50, conditions: 'Chaud' },
        { nom: 'Pékin', temperature: 24, humidite: 70, conditions: 'Pollué' }
      ]
    };
  }
};
</script>

<style scoped>
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
</style>
