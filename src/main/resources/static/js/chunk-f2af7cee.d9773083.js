(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-f2af7cee"],{"4a39":function(e,r,t){"use strict";t.r(r);var s=function(){var e=this,r=e.$createElement,t=e._self._c||r;return t("div",[t("h1",[e._v(" "+e._s(e.user.username)+" ")]),t("div",{staticClass:"d-flex general-container space-between"},[t("div",{staticClass:"card user-general-info"},[t("div",{staticClass:"card-body"},[e.isCurrenUser?t("div",{staticClass:"d-flex justify-content-between"},[t("h4",[e._v("Información del usuario")]),t("router-link",{attrs:{to:{name:"EditMyProfile"}}},[e._v("Editar")])],1):e._e(),t("h5",[e._v("Email: "+e._s(e.user.email)+" ")]),t("h5",[e._v("Nombre: "+e._s(e.user.name)+" "+e._s(e.user.lastname)+" ")]),t("h5",[e._v("Dirección: "+e._s(e.user.address))])])]),t("div",{staticClass:"card"},[e.isAdminUserLoggedIn?t("div",{staticClass:"card-body"},[t("h5",[e._v("Roles")]),t("ul",{staticClass:"list-group"},e._l(e.user.rolesUser,(function(r){return t("li",{key:r.id,staticClass:"list-group-item"},[e._v(" "+e._s(r.name)+" ")])})),0)]):e._e()])])])},n=[],a=t("1da1"),i=(t("96cf"),t("ac1f"),t("5319"),t("3f46")),u=function(e){return e.some((function(e){return 1==e.id}))},c={mounted:function(){var e=this;return Object(a["a"])(regeneratorRuntime.mark((function r(){var t;return regeneratorRuntime.wrap((function(r){while(1)switch(r.prev=r.next){case 0:return t=e.$route.params.id,e.currentUser.id==t||isAdminUserLoggedIn()||e.$router.replace({name:"Home"}),e.loading=!0,r.prev=3,r.next=6,i["a"].get("/api/users/",{params:{id:t}});case 6:e.user=r.sent.data,e.$route.meta.title=e.user.username,r.next=12;break;case 10:r.prev=10,r.t0=r["catch"](3);case 12:return r.prev=12,e.loading=!1,r.finish(12);case 15:case"end":return r.stop()}}),r,null,[[3,10,12,15]])})))()},data:function(){return{user:{}}},computed:{currentUser:function(){return this.$store.getters.currentUser},isAdminUserLoggedIn:function(){return u(this.currentUser.rolesUser)},isCurrenUser:function(){return this.currentUser.id==this.$route.params.id}}},o=c,d=(t("c7d3"),t("2877")),l=Object(d["a"])(o,s,n,!1,null,"e3453100",null);r["default"]=l.exports},b3fe:function(e,r,t){},c7d3:function(e,r,t){"use strict";t("b3fe")}}]);
//# sourceMappingURL=chunk-f2af7cee.d9773083.js.map