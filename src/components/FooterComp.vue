<template>
  <footer class="site-footer">
    <div class="footer-content">
      <!-- Section informations -->
      <div class="footer-section">
        <h4>À propos</h4>
        <p>
          Découvrez les meilleurs produits locaux de Savoie directement depuis nos producteurs. Fromages, charcuteries, vins et plus encore !
        </p>
      </div>

      <!-- Section liens utiles -->
      <div class="footer-section">
        <h4>Liens utiles</h4>
        <ul>
          <li><router-link to="/about">À propos de nous</router-link></li>
          <li><router-link to="/products">Nos produits</router-link></li>
          <li><router-link to="/contact">Contactez-nous</router-link></li>
          <li><router-link to="/terms">Conditions générales</router-link></li>
        </ul>
      </div>

      <!-- Section contact -->
      <div class="footer-section">
        <h4>Contactez-nous</h4>
        <ul>
          <li><strong>Email :</strong> contact@produits-savoyards.com</li>
          <li><strong>Téléphone :</strong> +33 4 50 00 00 00</li>
          <li><strong>Adresse :</strong> 123 Rue de la Savoie, Chambéry, France</li>
        </ul>
      </div>
    </div>

    <div class="footer-bottom">
      <p>&copy; 2024 Produits Savoyards. Tous droits réservés.</p>
    </div>
  </footer>
</template>

<script>
export default {
  name: 'FooterComponent',
};
</script>

<style scoped>
/* Styles pour le footer */
.site-footer {
  background-color: #333;
  color: #fff;
  padding: 20px;
  margin-top: 30px;
}

.footer-content {
  display: flex;
  justify-content: space-between;
  align-items: flex-start;
  flex-wrap: wrap;
}

.footer-section {
  flex: 1;
  margin: 10px;
}

.footer-section h4 {
  font-size: 1.2rem;
  margin-bottom: 10px;
}

.footer-section ul {
  list-style: none;
  padding: 0;
}

.footer-section ul li {
  margin-bottom: 5px;
}

.footer-section ul li a {
  color: #fff;
  text-decoration: none;
}

.footer-section ul li a:hover {
  text-decoration: underline;
}

.footer-bottom {
  text-align: center;
  margin-top: 20px;
  border-top: 1px solid #555;
  padding-top: 10px;
}

.footer-bottom p {
  margin: 0;
}
</style>
