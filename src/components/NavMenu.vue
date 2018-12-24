<template>
  <el-row class="tac">
    <!-- 侧边栏宽度-->
    <el-col :span="35">
      <el-menu default-active="2" class="el-menu-vertical-demo" @open="handleOpen" @close="handleClose"
               unique-opened router background-color="#545c64" text-color="#fff" active-text-color="#ffd04b">
        <el-form ref="form" :model="form">
          <el-input placeholder="请输入名称"
                    suffix-icon="el-icon-search"></el-input>
        </el-form>
        <el-menu-item class="category-list" v-for="item in items" :key="item" @click="handleRedisSelect(item)">
          {{item}}
        </el-menu-item>
      </el-menu>
    </el-col>
  </el-row>
</template>

<script>
export default {
  name: 'NavMenu',
  data () {
    return {
      items: ['redis1', 'redis2', 'redis3', 'redis4']
    }
  },
  methods: {
    handleOpen (key, keyPath) {
      console.log(key, keyPath)
    },
    handleClose (key, keyPath) {
      console.log(key, keyPath)
    },
    handleRedisSelect (redisKey) {
      this.$store.dispatch('selectRedis', redisKey)
    }
  }
}
</script>

<style scoped>

</style>
