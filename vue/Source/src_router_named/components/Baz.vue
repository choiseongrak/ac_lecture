<template>
  <div class="hello">
    <h1>Baz</h1>
    {{$route.query.foo}}
  </div>
</template>

<script>
export default {
  name: "Baz",
  props: {
    id: String,
  },
}
</script>

<style scoped>

</style>
