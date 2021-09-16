<template>
  <div id="app">
    <img alt="Vue logo" src="./assets/logo.png" />
    <Artists />
  </div>
</template>

<script>
import Artists from "./components/Artists.vue";

export default {
  name: "App",
  components: {
    Artists,
  },
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
