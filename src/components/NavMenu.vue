<template>
  <el-row class="tac">
    <!-- 侧边栏宽度-->
    <el-col :span="35">
      <el-menu default-active="2" class="el-menu-vertical-demo" @open="handleOpen" @close="handleClose"
               unique-opened router background-color="#545c64" text-color="#fff" active-text-color="#ffd04b">
        <el-form ref="form" :model="form">
          <el-input v-model="search" placeholder="请输入Redis实例名称"
                    suffix-icon="el-icon-search"></el-input>
        </el-form>
        <div v-if="searchData.length>0">
          <el-menu-item class="category-list" v-for="item in searchData" :key="item" @click="handleRedisSelect(item)">
            {{item}}
          </el-menu-item>
        </div>
        <div v-else>
          暂无数据
        </div>
      </el-menu>
    </el-col>
  </el-row>
</template>

<script>
export default {
  name: 'NavMenu',
  data () {
    return {
      search: '',
      items: []
    }
  },
  mounted () {
    this.$axios
      .get('/names')
      .then(response => {
        if (response.data.code === 200) {
          this.items = response.data.data
        } else {
          alert(response.data.message)
        }
      })
      .catch(response => {
        alert(response.data.message)
      })
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
  },
  computed: {
    searchData () {
      var search = this.search
      console.log(search)
      console.log(this.items)
      if (search) {
        return this.items.filter(function (item) {
          return item.includes(search)
        })
      }
      return this.items
    }
  }
}
</script>

<style scoped>

</style>
