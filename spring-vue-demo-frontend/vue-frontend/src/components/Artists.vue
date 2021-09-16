<template>
  <div id="artistWrapper" class="container">
    <h1 class="text-center">Artists</h1>
    <table class="table table-striped">
      <thead>
        <tr>
          <th>Id</th>
          <th>Name</th>
          <th>Surname</th>
          <th>Alias</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="artist in artists" v-bind:key="artist.id">
          <td>{{ artist.id }}</td>
          <td>{{ artist.name }}</td>
          <td>{{ artist.surname }}</td>
          <td>{{ artist.alias }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
import ArtistService from "../services/ArtistService";

export default {
  name: "Artist",
  data() {
    return {
      artists: [],
    };
  },
  methods: {
    getArtists() {
      ArtistService.getArtists().then((response) => {
        this.artists = response.data;
      });
    },
  },
  created() {
    this.getArtists();
  },
};
</script>

<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
