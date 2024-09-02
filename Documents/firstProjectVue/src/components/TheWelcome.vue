<script>
export default {
  data() {
    return {
      lien: null // Initialize lien as null
    };
  },
  mounted() {
    // Set lien after the component is mounted and the DOM is available
    this.lien = document.querySelector('a[href="https://meteofrance.com"]');
  },
  methods: {
    Alerte() {
      alert("test");
      this.test();
    },
    test() {
      if (this.lien) {
        console.log(this.lien.textContent); // Afficher le texte de l'élément <a>
      } else {
        console.log("Lien not found");
      }
    }
  }
}
</script>

<template>

  <h3>Lien Méteo</h3>

  <p>La méteo locale</p>
  <p><a ref="a"  @click="Alerte" href="https://meteofrance.com/" target="_blank" rel="noopener">site officiel </a>
      du jour ou celle d'ailleurs</p>

</template>
