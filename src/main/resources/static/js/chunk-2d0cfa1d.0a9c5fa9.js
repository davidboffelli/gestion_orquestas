(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-2d0cfa1d"],{6519:function(t,e,n){"use strict";n.r(e);var r=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",[t._l(t.links,(function(e){return n("div",{key:e.name},[n("router-link",{staticClass:"nav-link pl-0",attrs:{to:e}},[t._v(t._s(e.meta.link_name)+" "),!t.currentUserIsGuest&&e.meta.for_guest?n("span",[t._v("(para invitados)")]):t._e()])],1)})),n("div",[n("router-link",{staticClass:"nav-link pl-0",staticStyle:{"margin-top":"20px"},attrs:{to:{name:"Home"}}},[t._v("Regresar")])],1)],2)},s=[],i=(n("7db0"),n("4de4"),{data:function(){return{links:[]}},computed:{currentUserIsGuest:function(){var t=this.$store.getters.currentUser;return!t||!this.$store.getters.currentUserIsAdmin}},mounted:function(){var t=this.$router.options.routes.find((function(t){return t.meta.is_docs})),e=t.children.filter((function(t){return t.meta.is_docs}));console.log(this.currentUserIsGuest),this.currentUserIsGuest&&(e=e.filter((function(t){return t.meta.for_guest}))),this.links=e}}),u=i,o=n("2877"),a=Object(o["a"])(u,r,s,!1,null,null,null);e["default"]=a.exports}}]);
//# sourceMappingURL=chunk-2d0cfa1d.0a9c5fa9.js.map