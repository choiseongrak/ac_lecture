import Vue from 'vue';
import VueRouter from 'vue-router';

import Bar from './components/Bar.vue';
import Foo from './components/Foo.vue';
import NotFound from './components/NotFound.vue';
import Baz from './components/Baz.vue';


Vue.use(VueRouter);

const routes = [
    { path: '/', component: Bar, name: "Bar" },
    { path: '/login', component: Foo, name: "Foo" },
    { path: '/my/:id', component: Baz, name: "Baz", props:true},//속성상
    { path: '*', component: NotFound, name: "NotFound" }

]

const router = new VueRouter({routes});
export default router;
