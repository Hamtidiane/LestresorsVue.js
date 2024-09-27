<script>
import { RouterLink } from 'vue-router'

export default {
  components: { RouterLink },
  data() {
    return {
      lien: null // Initialize lien as null
    }
  },
  mounted() {
    // Set lien after the component is mounted and the DOM is available
    this.lien = document.querySelector('a[href="https://meteofrance.com"]')
  },
  methods: {
    Alerte() {

      alert("La page va s'ouvrir")
      this.test()
    },
    test() {
      if (this.lien) {
        console.log(this.lien.textContent) // Afficher le texte de l'élément <a>
      } else {
        console.log('Lien not found')
      }
    }
  }
}

</script>

<template>
  <h3>Lien Méteo</h3>

  <p>La méteo locale</p>
  <p>
    <RouterLink to="/hamad" @click="Alerte">site officiel
    </RouterLink>
    du jour ou celle d'ailleurs
  </p>
</template>
