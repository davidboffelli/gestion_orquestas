(function(e){function t(t){for(var a,r,o=t[0],u=t[1],c=t[2],l=0,d=[];l<o.length;l++)r=o[l],Object.prototype.hasOwnProperty.call(s,r)&&s[r]&&d.push(s[r][0]),s[r]=0;for(a in u)Object.prototype.hasOwnProperty.call(u,a)&&(e[a]=u[a]);m&&m(t);while(d.length)d.shift()();return i.push.apply(i,c||[]),n()}function n(){for(var e,t=0;t<i.length;t++){for(var n=i[t],a=!0,r=1;r<n.length;r++){var o=n[r];0!==s[o]&&(a=!1)}a&&(i.splice(t--,1),e=u(u.s=n[0]))}return e}var a={},r={app:0},s={app:0},i=[];function o(e){return u.p+"js/"+({FailedPayment:"FailedPayment",UserList:"UserList",usermanagement:"usermanagement",dashboard:"dashboard",login:"login",register:"register",useradd:"useradd"}[e]||e)+"."+{FailedPayment:"0eca0fc5","chunk-17dd097e":"4e1575af","chunk-27cf8331":"17bc10fe","chunk-2d0b377e":"8f7d89bd","chunk-2d0d3326":"f8c79fac","chunk-2d2100b6":"867de58d","chunk-41beee16":"82cd3393","chunk-7045d9e3":"610bae5b","chunk-21fece4f":"5218f6a6",UserList:"6e712cfd","chunk-3398408e":"48bac141",usermanagement:"9bc5327a","chunk-33c46e00":"6b9f55ee","chunk-907c5956":"e0c11952",dashboard:"679b052c",login:"301fdfca",register:"0278b0df",useradd:"8d9d45b4"}[e]+".js"}function u(t){if(a[t])return a[t].exports;var n=a[t]={i:t,l:!1,exports:{}};return e[t].call(n.exports,n,n.exports,u),n.l=!0,n.exports}u.e=function(e){var t=[],n={"chunk-17dd097e":1,"chunk-27cf8331":1,"chunk-41beee16":1,"chunk-7045d9e3":1,"chunk-21fece4f":1,usermanagement:1,"chunk-907c5956":1,login:1,register:1};r[e]?t.push(r[e]):0!==r[e]&&n[e]&&t.push(r[e]=new Promise((function(t,n){for(var a="css/"+({FailedPayment:"FailedPayment",UserList:"UserList",usermanagement:"usermanagement",dashboard:"dashboard",login:"login",register:"register",useradd:"useradd"}[e]||e)+"."+{FailedPayment:"31d6cfe0","chunk-17dd097e":"7dc2d3d9","chunk-27cf8331":"431106d6","chunk-2d0b377e":"31d6cfe0","chunk-2d0d3326":"31d6cfe0","chunk-2d2100b6":"31d6cfe0","chunk-41beee16":"526ecdd4","chunk-7045d9e3":"3e1cab8d","chunk-21fece4f":"6a759d59",UserList:"31d6cfe0","chunk-3398408e":"31d6cfe0",usermanagement:"9965895c","chunk-33c46e00":"31d6cfe0","chunk-907c5956":"94ba5db8",dashboard:"31d6cfe0",login:"108c4623",register:"7d497097",useradd:"31d6cfe0"}[e]+".css",s=u.p+a,i=document.getElementsByTagName("link"),o=0;o<i.length;o++){var c=i[o],l=c.getAttribute("data-href")||c.getAttribute("href");if("stylesheet"===c.rel&&(l===a||l===s))return t()}var d=document.getElementsByTagName("style");for(o=0;o<d.length;o++){c=d[o],l=c.getAttribute("data-href");if(l===a||l===s)return t()}var m=document.createElement("link");m.rel="stylesheet",m.type="text/css",m.onload=t,m.onerror=function(t){var a=t&&t.target&&t.target.src||s,i=new Error("Loading CSS chunk "+e+" failed.\n("+a+")");i.code="CSS_CHUNK_LOAD_FAILED",i.request=a,delete r[e],m.parentNode.removeChild(m),n(i)},m.href=s;var f=document.getElementsByTagName("head")[0];f.appendChild(m)})).then((function(){r[e]=0})));var a=s[e];if(0!==a)if(a)t.push(a[2]);else{var i=new Promise((function(t,n){a=s[e]=[t,n]}));t.push(a[2]=i);var c,l=document.createElement("script");l.charset="utf-8",l.timeout=120,u.nc&&l.setAttribute("nonce",u.nc),l.src=o(e);var d=new Error;c=function(t){l.onerror=l.onload=null,clearTimeout(m);var n=s[e];if(0!==n){if(n){var a=t&&("load"===t.type?"missing":t.type),r=t&&t.target&&t.target.src;d.message="Loading chunk "+e+" failed.\n("+a+": "+r+")",d.name="ChunkLoadError",d.type=a,d.request=r,n[1](d)}s[e]=void 0}};var m=setTimeout((function(){c({type:"timeout",target:l})}),12e4);l.onerror=l.onload=c,document.head.appendChild(l)}return Promise.all(t)},u.m=e,u.c=a,u.d=function(e,t,n){u.o(e,t)||Object.defineProperty(e,t,{enumerable:!0,get:n})},u.r=function(e){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(e,"__esModule",{value:!0})},u.t=function(e,t){if(1&t&&(e=u(e)),8&t)return e;if(4&t&&"object"===typeof e&&e&&e.__esModule)return e;var n=Object.create(null);if(u.r(n),Object.defineProperty(n,"default",{enumerable:!0,value:e}),2&t&&"string"!=typeof e)for(var a in e)u.d(n,a,function(t){return e[t]}.bind(null,a));return n},u.n=function(e){var t=e&&e.__esModule?function(){return e["default"]}:function(){return e};return u.d(t,"a",t),t},u.o=function(e,t){return Object.prototype.hasOwnProperty.call(e,t)},u.p="/",u.oe=function(e){throw console.error(e),e};var c=window["webpackJsonp"]=window["webpackJsonp"]||[],l=c.push.bind(c);c.push=t,c=c.slice();for(var d=0;d<c.length;d++)t(c[d]);var m=l;i.push([0,"chunk-vendors"]),n()})({0:function(e,t,n){e.exports=n("56d7")},"0c6c":function(e,t,n){},"2b33":function(e,t,n){"use strict";var a=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("input",{staticClass:"form-control",attrs:{type:"text"},domProps:{value:e.value},on:{input:function(t){return e.$emit("input",t.target.value)}}})},r=[],s={props:["value"]},i=s,o=n("2877"),u=Object(o["a"])(i,a,r,!1,null,null,null);t["a"]=u.exports},"2bb3":function(e,t,n){"use strict";n("2eeb")},"2eeb":function(e,t,n){},"3e98":function(e,t,n){"use strict";n("f2bc")},"3f1f":function(e,t,n){"use strict";n("eac4")},"3f46":function(e,t,n){"use strict";n("d3b7");var a=n("bc3a"),r=n.n(a);r.a.interceptors.request.use((function(e){var t=window.localStorage.getItem("jwt");return t&&(e.headers.Authorization="Bearer ".concat(t)),e}),(function(e){return Promise.reject(e)})),r.a.interceptors.response.use((function(e){return Promise.resolve(e.data)}),(function(e){return console.log(e),403==e.response.status&&(window.localStorage.removeItem("jwt"),window.localStorage.removeItem("user")),Promise.reject(e)})),t["a"]=r.a},4678:function(e,t,n){var a={"./af":"2bfb","./af.js":"2bfb","./ar":"8e73","./ar-dz":"a356","./ar-dz.js":"a356","./ar-kw":"423e","./ar-kw.js":"423e","./ar-ly":"1cfd","./ar-ly.js":"1cfd","./ar-ma":"0a84","./ar-ma.js":"0a84","./ar-sa":"8230","./ar-sa.js":"8230","./ar-tn":"6d83","./ar-tn.js":"6d83","./ar.js":"8e73","./az":"485c","./az.js":"485c","./be":"1fc1","./be.js":"1fc1","./bg":"84aa","./bg.js":"84aa","./bm":"a7fa","./bm.js":"a7fa","./bn":"9043","./bn-bd":"9686","./bn-bd.js":"9686","./bn.js":"9043","./bo":"d26a","./bo.js":"d26a","./br":"6887","./br.js":"6887","./bs":"2554","./bs.js":"2554","./ca":"d716","./ca.js":"d716","./cs":"3c0d","./cs.js":"3c0d","./cv":"03ec","./cv.js":"03ec","./cy":"9797","./cy.js":"9797","./da":"0f14","./da.js":"0f14","./de":"b469","./de-at":"b3eb","./de-at.js":"b3eb","./de-ch":"bb71","./de-ch.js":"bb71","./de.js":"b469","./dv":"598a","./dv.js":"598a","./el":"8d47","./el.js":"8d47","./en-au":"0e6b","./en-au.js":"0e6b","./en-ca":"3886","./en-ca.js":"3886","./en-gb":"39a6","./en-gb.js":"39a6","./en-ie":"e1d3","./en-ie.js":"e1d3","./en-il":"7333","./en-il.js":"7333","./en-in":"ec2e","./en-in.js":"ec2e","./en-nz":"6f50","./en-nz.js":"6f50","./en-sg":"b7e9","./en-sg.js":"b7e9","./eo":"65db","./eo.js":"65db","./es":"898b","./es-do":"0a3c","./es-do.js":"0a3c","./es-mx":"b5b7","./es-mx.js":"b5b7","./es-us":"55c9","./es-us.js":"55c9","./es.js":"898b","./et":"ec18","./et.js":"ec18","./eu":"0ff2","./eu.js":"0ff2","./fa":"8df4","./fa.js":"8df4","./fi":"81e9","./fi.js":"81e9","./fil":"d69a","./fil.js":"d69a","./fo":"0721","./fo.js":"0721","./fr":"9f26","./fr-ca":"d9f8","./fr-ca.js":"d9f8","./fr-ch":"0e49","./fr-ch.js":"0e49","./fr.js":"9f26","./fy":"7118","./fy.js":"7118","./ga":"5120","./ga.js":"5120","./gd":"f6b4","./gd.js":"f6b4","./gl":"8840","./gl.js":"8840","./gom-deva":"aaf2","./gom-deva.js":"aaf2","./gom-latn":"0caa","./gom-latn.js":"0caa","./gu":"e0c5","./gu.js":"e0c5","./he":"c7aa","./he.js":"c7aa","./hi":"dc4d","./hi.js":"dc4d","./hr":"4ba9","./hr.js":"4ba9","./hu":"5b14","./hu.js":"5b14","./hy-am":"d6b6","./hy-am.js":"d6b6","./id":"5038","./id.js":"5038","./is":"0558","./is.js":"0558","./it":"6e98","./it-ch":"6f12","./it-ch.js":"6f12","./it.js":"6e98","./ja":"079e","./ja.js":"079e","./jv":"b540","./jv.js":"b540","./ka":"201b","./ka.js":"201b","./kk":"6d79","./kk.js":"6d79","./km":"e81d","./km.js":"e81d","./kn":"3e92","./kn.js":"3e92","./ko":"22f8","./ko.js":"22f8","./ku":"2421","./ku.js":"2421","./ky":"9609","./ky.js":"9609","./lb":"440c","./lb.js":"440c","./lo":"b29d","./lo.js":"b29d","./lt":"26f9","./lt.js":"26f9","./lv":"b97c","./lv.js":"b97c","./me":"293c","./me.js":"293c","./mi":"688b2","./mi.js":"688b2","./mk":"6909","./mk.js":"6909","./ml":"02fb","./ml.js":"02fb","./mn":"958b","./mn.js":"958b","./mr":"39bd","./mr.js":"39bd","./ms":"ebe4","./ms-my":"6403","./ms-my.js":"6403","./ms.js":"ebe4","./mt":"1b45","./mt.js":"1b45","./my":"8689","./my.js":"8689","./nb":"6ce3","./nb.js":"6ce3","./ne":"3a39","./ne.js":"3a39","./nl":"facd","./nl-be":"db29","./nl-be.js":"db29","./nl.js":"facd","./nn":"b84c","./nn.js":"b84c","./oc-lnc":"167b","./oc-lnc.js":"167b","./pa-in":"f3ff","./pa-in.js":"f3ff","./pl":"8d57","./pl.js":"8d57","./pt":"f260","./pt-br":"d2d4","./pt-br.js":"d2d4","./pt.js":"f260","./ro":"972c","./ro.js":"972c","./ru":"957c","./ru.js":"957c","./sd":"6784","./sd.js":"6784","./se":"ffff","./se.js":"ffff","./si":"eda5","./si.js":"eda5","./sk":"7be6","./sk.js":"7be6","./sl":"8155","./sl.js":"8155","./sq":"c8f3","./sq.js":"c8f3","./sr":"cf1e","./sr-cyrl":"13e9","./sr-cyrl.js":"13e9","./sr.js":"cf1e","./ss":"52bd","./ss.js":"52bd","./sv":"5fbd","./sv.js":"5fbd","./sw":"74dc","./sw.js":"74dc","./ta":"3de5","./ta.js":"3de5","./te":"5cbb","./te.js":"5cbb","./tet":"576c","./tet.js":"576c","./tg":"3b1b","./tg.js":"3b1b","./th":"10e8","./th.js":"10e8","./tk":"5aff","./tk.js":"5aff","./tl-ph":"0f38","./tl-ph.js":"0f38","./tlh":"cf75","./tlh.js":"cf75","./tr":"0e81","./tr.js":"0e81","./tzl":"cf51","./tzl.js":"cf51","./tzm":"c109","./tzm-latn":"b53d","./tzm-latn.js":"b53d","./tzm.js":"c109","./ug-cn":"6117","./ug-cn.js":"6117","./uk":"ada2","./uk.js":"ada2","./ur":"5294","./ur.js":"5294","./uz":"2e8c","./uz-latn":"010e","./uz-latn.js":"010e","./uz.js":"2e8c","./vi":"2921","./vi.js":"2921","./x-pseudo":"fd7e","./x-pseudo.js":"fd7e","./yo":"7f33","./yo.js":"7f33","./zh-cn":"5c3a","./zh-cn.js":"5c3a","./zh-hk":"49ab","./zh-hk.js":"49ab","./zh-mo":"3a6c","./zh-mo.js":"3a6c","./zh-tw":"90ea","./zh-tw.js":"90ea"};function r(e){var t=s(e);return n(t)}function s(e){if(!n.o(a,e)){var t=new Error("Cannot find module '"+e+"'");throw t.code="MODULE_NOT_FOUND",t}return a[e]}r.keys=function(){return Object.keys(a)},r.resolve=s,e.exports=r,r.id="4678"},"54d0":function(e,t,n){},"569b":function(e,t,n){"use strict";n("99eb")},"56d7":function(e,t,n){"use strict";n.r(t);n("e260"),n("e6cf"),n("cca6"),n("a79d");var a=n("2b0e"),r=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",{attrs:{id:"app"}},["admin"==e.currentLayout?n("admin-layout",[n("router-view")],1):e._e(),"user"==e.currentLayout?n("user-layout",[n("router-view")],1):e._e(),"login"==e.currentLayout?n("registration-layout",[n("router-view")],1):e._e(),"user-home"==e.currentLayout?n("user-home-layout",[n("router-view")],1):e._e()],1)},s=[],i=(n("b0c0"),function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",{staticClass:"container-fluid h-100",attrs:{id:"admin-layout"}},[n("div",{},[n("admin-menu"),n("main",{staticClass:"col"},[n("nav",{staticClass:"d-flex justify-content-between"},[n("div",[n("h1",[e._v(e._s(e.title))])]),n("account-menu")],1),n("section",[e._t("default")],2)])],1)])}),o=[],u=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",[n("b-button",{directives:[{name:"b-toggle",rawName:"v-b-toggle.sidebar-menu",modifiers:{"sidebar-menu":!0}}],staticClass:"toggler"},[n("Menu")],1),n("b-sidebar",{attrs:{id:"sidebar-menu",title:"Administración",shadow:""}},[n("div",{staticClass:"px-3 py-2"},[n("ul",{staticClass:"\n                    flex-column\n                    navbar-nav\n                    w-100\n                    justify-content-between\n                "},e._l(e.links,(function(t){return n("li",{key:t.name,staticClass:"nav-item"},[n("router-link",{staticClass:"nav-link pl-0",attrs:{to:{name:t.name}}},[e._v(e._s(t.meta.link_name))])],1)})),0)])])],1)},c=[],l=(n("4de4"),n("8aa8")),d={components:{Menu:l["a"]},data:function(){return{links:[]}},mounted:function(){this.links=this.$router.options.routes.filter((function(e){return 1==e.meta.is_admin}))}},m=d,f=(n("569b"),n("2877")),h=Object(f["a"])(m,u,c,!1,null,"88997a8e",null),b=h.exports,p=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",{staticClass:"d-flex justify-content-between"},[n("router-link",{attrs:{to:{name:"UserProfile",params:{id:e.currentUser.id}}}},[e._v("Mi cuenta")]),n("span",[e._v("|")]),n("router-link",{attrs:{to:{name:"MyTickets"}}},[e._v("Mis Entradas")]),n("span",[e._v("|")]),n("a",{staticClass:"btn-link",on:{click:e.logout}},[e._v("Cerrar sesión")])],1)},g=[],v={methods:{logout:function(){this.$store.dispatch("logout"),this.$router.push({name:"Home"})}},computed:{currentUser:function(){return this.$store.getters.currentUser}}},_=v,j=(n("3e98"),Object(f["a"])(_,p,g,!1,null,"743fe202",null)),k=j.exports,w={components:{"admin-menu":b,"account-menu":k},computed:{title:function(){return this.$route.meta.link_name}}},y=w,C=(n("a7e2"),Object(f["a"])(y,i,o,!1,null,null,null)),S=C.exports,x=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",{staticClass:"main-container",attrs:{id:"user-layout-container"}},[a("b-navbar",{staticClass:"main-navbar",attrs:{toggleable:"lg",sticky:!0}},[a("b-navbar-toggle",{attrs:{target:"nav-collapse"}}),a("b-collapse",{attrs:{id:"nav-collapse-alt","is-nav":""}},[a("b-navbar-nav",{staticClass:"d-flex align-items-center"},[a("b-nav-item",[a("img",{attrs:{height:"40px",src:n("cf05")}})]),a("b-nav-item",[a("router-link",{attrs:{to:{name:"Home"}}},[e._v("Home")])],1)],1),a("b-navbar-nav",{staticClass:"social-icons align-items-center"},[a("Instagram"),a("Facebook"),a("Twitter")],1),a("b-navbar-nav",[e.isLoggedIn?a("account-menu"):a("guests-menu")],1)],1)],1),a("main",[a("div",{staticClass:"container"},[e._t("default")],2)]),a("footer",[e._v("Charagua, suena la orilla")])],1)},U=[],N=n("03b1"),P=n("d5df"),A=n("e792"),O=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",[n("router-link",{attrs:{to:{name:"Login"}}},[e._v("Ingresa")]),e._v(" | "),n("router-link",{attrs:{to:{name:"Register"}}},[e._v("Registrate")])],1)},L=[],E={},R=Object(f["a"])(E,O,L,!1,null,null,null),q=R.exports,T={components:{Instagram:N["a"],Facebook:P["a"],Twitter:A["a"],AccountMenu:k,GuestsMenu:q},computed:{isLoggedIn:function(){return this.$store.getters.isLoggedIn}}},I=T,$=(n("e873"),Object(f["a"])(I,x,U,!1,null,"0224d1d4",null)),M=$.exports,z=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",{staticClass:"main-container",attrs:{id:"user-layout-container"}},[a("b-navbar",{staticClass:"main-navbar",attrs:{toggleable:"lg",sticky:!0}},[a("b-navbar-toggle",{attrs:{target:"nav-collapse"}}),a("b-collapse",{attrs:{id:"nav-collapse-alt","is-nav":""}},[a("b-navbar-nav",{staticClass:"d-flex align-items-center"},[a("b-nav-item",[a("img",{attrs:{height:"40px",src:n("cf05")}})]),a("b-nav-item",[a("router-link",{attrs:{to:{name:"Home"}}},[e._v("Home")])],1)],1),a("b-navbar-nav",{staticClass:"social-icons align-items-center"},[a("Instagram"),a("Facebook"),a("Twitter"),a("b-nav-item",{staticStyle:{"min-width":"300px"},attrs:{href:"#"}},[e.isLoggedIn?a("account-menu"):a("guests-menu")],1)],1)],1)],1),a("main",[e._t("default")],2),a("footer",[e._v("Charagua, suena la orilla")])],1)},D=[],F={components:{Instagram:N["a"],Facebook:P["a"],Twitter:A["a"],AccountMenu:k,GuestsMenu:q},computed:{isLoggedIn:function(){return this.$store.getters.isLoggedIn}}},H=F,Y=(n("cc02"),Object(f["a"])(H,z,D,!1,null,null,null)),V=Y.exports,B=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",{attrs:{id:"registration-layout"}},[e._t("default")],2)},J=[],G=(n("2bb3"),{}),K=Object(f["a"])(G,B,J,!1,null,"40d8bb38",null),Q=K.exports,W={components:{"admin-layout":S,"user-layout":M,"registration-layout":Q,UserHomeLayout:V},data:function(){return{}},created:function(){},computed:{users:function(){return this.$store.getters.users},currentUserIsAdmin:function(){return this.$store.getters.currentUserIsAdmin},currentLayout:function(){if(this.$route.meta.hasOwnProperty("layout"))return this.$route.meta.layout;if("Login"==this.$route.name||"Register"==this.$route.name)return"login";var e=this.$store.getters.currentUser;return e&&this.currentUserIsAdmin?"admin":"user"}}},X=W,Z=(n("5c0b"),Object(f["a"])(X,r,s,!1,null,null,null)),ee=Z.exports,te=(n("d3b7"),n("3ca3"),n("ddb0"),n("caad"),n("2532"),n("d81d"),n("8c4f")),ne=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",{attrs:{id:"home-container"}},[n("div",{attrs:{id:"carousel-container"}},[n("carousel",{attrs:{autoplay:!0,"per-page":1}},[n("slide",[n("div",[n("img",{staticStyle:{width:"100%"},attrs:{src:"https://upload.wikimedia.org/wikipedia/commons/thumb/1/19/Dublin_Philharmonic_Orchestra_performing_Tchaikovsky%27s_Symphony_No_4_in_Charlotte%2C_North_Carolina.jpg/800px-Dublin_Philharmonic_Orchestra_performing_Tchaikovsky%27s_Symphony_No_4_in_Charlotte%2C_North_Carolina.jpg"}})])]),n("slide",[n("div",[n("img",{staticStyle:{width:"100%","object-fit":"cover"},attrs:{src:"https://upload.wikimedia.org/wikipedia/commons/thumb/1/19/Dublin_Philharmonic_Orchestra_performing_Tchaikovsky%27s_Symphony_No_4_in_Charlotte%2C_North_Carolina.jpg/800px-Dublin_Philharmonic_Orchestra_performing_Tchaikovsky%27s_Symphony_No_4_in_Charlotte%2C_North_Carolina.jpg"}})])])],1)],1),n("div",{staticClass:"content"},[n("aside",[n("next-shows",{attrs:{"next-shows":e.nextShows}})],1),n("section",[n("article",[e._m(0),n("div",[n("h3",[e._v("Últimas noticias")]),n("div",{attrs:{id:"news-container"}},e._l(e.latestNews,(function(e){return n("new-card",{key:e.id,attrs:{"a-new":e}})})),1)])])])])])},ae=[function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",[n("h1",[e._v("Charagua")]),n("h2",[e._v("Suena la orilla")])])}],re=n("3f46"),se=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",{staticClass:"card",attrs:{id:"new"+e.aNew.id}},[n("img",{staticClass:"card-img-top",attrs:{src:"https://upload.wikimedia.org/wikipedia/commons/thumb/1/19/Dublin_Philharmonic_Orchestra_performing_Tchaikovsky%27s_Symphony_No_4_in_Charlotte%2C_North_Carolina.jpg/800px-Dublin_Philharmonic_Orchestra_performing_Tchaikovsky%27s_Symphony_No_4_in_Charlotte%2C_North_Carolina.jpg"}}),n("div",{staticClass:"card-body"},[n("div",{staticClass:"card-title"},[e._v(" "+e._s(e.aNew.title)+" ")]),n("p",{staticClass:"card-text"},[e._v(e._s(e.aNew.body))]),n("router-link",{staticClass:"btn btn-primary",attrs:{to:{name:"NewView",params:{id:e.aNew.id}}}},[e._v("Leer")])],1)])},ie=[],oe={props:["aNew"]},ue=oe,ce=(n("a87c"),Object(f["a"])(ue,se,ie,!1,null,"308209ae",null)),le=ce.exports,de=n("0a63"),me=n.n(de),fe=function(){var e=this,t=e.$createElement,n=e._self._c||t;return e.nextShows.length?n("div",[n("div",[e._v("Próximos shows!")]),n("ul",e._l(e.nextShows,(function(t){return n("li",{key:t.id},[n("router-link",{staticClass:"show-link",attrs:{to:{name:"ShowView",params:{id:t.id}}}},[e._v(" "+e._s(t.place)+" - "+e._s(e._f("date")(t.date,"DD/MM"))+" ")])],1)})),0)]):e._e()},he=[],be={props:{nextShows:{type:Array,required:!0}}},pe=be,ge=(n("d3eb"),Object(f["a"])(pe,fe,he,!1,null,"9d5f5ec8",null)),ve=ge.exports,_e={components:{NewCard:le,Carousel:de["Carousel"],Slide:de["Slide"],NextShows:ve},data:function(){return{latestNews:[],nextShows:[]}},computed:{currentUser:function(){return this.$store.getters.currentUser}},mounted:function(){var e=this;re["a"].get("/api/news").then((function(t){e.latestNews=t.data})),re["a"].get("/api/shows").then((function(t){e.nextShows=t.data}))}},je=_e,ke=(n("3f1f"),Object(f["a"])(je,ne,ae,!1,null,"1ce51600",null)),we=ke.exports;a["default"].use(te["a"]);var ye=[{path:"/payment/buy/failed",name:"PagoFallido",component:function(){return n.e("FailedPayment").then(n.bind(null,"a953"))},meta:{requiresAuth:!0,layout:"user",title:"Pago fallido"}},{path:"/payment/buy/success",name:"PagoAprobado",component:function(){return n.e("register").then(n.bind(null,"43f0"))},meta:{requiresAuth:!0,title:"Pago exitoso",link_name:"PaymentSuccessfull",layout:"user"}},{path:"/user/register",name:"Register",component:function(){return n.e("register").then(n.bind(null,"73cf"))},meta:{title:"Registrarse",guest:!0,link_name:"Registrarse"}},{path:"/new/:id",name:"NewView",component:function(){return n.e("register").then(n.bind(null,"d563"))},meta:{guest:!0,title:"Noticia"}},{path:"/user/login",name:"Login",component:function(){return n.e("login").then(n.bind(null,"a55b"))},meta:{guest:!0,title:"Login",link_name:"Log In"}},{path:"/user/:id",name:"UserProfile",component:function(){return n.e("chunk-27cf8331").then(n.bind(null,"4a39"))},meta:{title:"Perfil de usuario",requiresAuth:!0}},{path:"/shows/:id",name:"ShowView",component:function(){return n.e("chunk-2d0d3326").then(n.bind(null,"5c79"))},meta:{requiresAuth:!1,title:"Show",link_name:"ShowView",layout:"user"}},{path:"/shows/:id/buy",name:"BuyTickets",component:function(){return n.e("chunk-17dd097e").then(n.bind(null,"ab24"))},meta:{requiresAuth:!0,title:"Comprar entrada",link_name:"BuyTickets",layout:"user"}},{path:"/tickets",name:"MyTickets",component:function(){return n.e("chunk-907c5956").then(n.bind(null,"d185"))},meta:{requiresAuth:!0,link_name:"MyTickets",title:"Mis entradas",layout:"user"}},{path:"/",name:"Home",component:we,meta:{requiresAuth:!1,title:"Home",link_name:"Home",layout:"user-home"}},{path:"/admin/dashboard",name:"Dashboard",component:function(){return n.e("dashboard").then(n.bind(null,"7277"))},meta:{requiresAuth:!0,title:"Dashboard",is_admin:!0,link_name:"Dashboard"}},{path:"/admin/resources",name:"Recursos",component:function(){return Promise.all([n.e("chunk-7045d9e3"),n.e("chunk-21fece4f"),n.e("usermanagement")]).then(n.bind(null,"5996"))},meta:{requiresAuth:!0,title:"Recursos",is_admin:!0,link_name:"Recursos"},redirect:{name:"ResourcesList"},children:[{path:"",name:"ResourcesList",component:function(){return Promise.all([n.e("chunk-7045d9e3"),n.e("chunk-21fece4f"),n.e("usermanagement")]).then(n.bind(null,"a735"))},meta:{requiresAuth:!0,title:"Recursos",is_admin:!0,link_name:"Recursos"}},{path:"add/:type",name:"CrearRecurso",component:function(){return Promise.all([n.e("chunk-7045d9e3"),n.e("chunk-21fece4f"),n.e("usermanagement")]).then(n.bind(null,"a4ac"))},meta:{requiresAuth:!0,is_admin:!0,title:"Nuevo recurso",link_name:"Recursos"}},{path:":id",name:"VerRecurso",component:function(){return Promise.all([n.e("chunk-7045d9e3"),n.e("chunk-21fece4f"),n.e("usermanagement")]).then(n.bind(null,"8f6e"))},meta:{requiresAuth:!0,is_admin:!0,title:"Recurso",link_name:"VistaRecurso"}},{path:":id/editar",name:"EditarRecurso",component:function(){return Promise.all([n.e("chunk-7045d9e3"),n.e("chunk-21fece4f"),n.e("usermanagement")]).then(n.bind(null,"a4ac"))},meta:{requiresAuth:!0,is_admin:!0,link_name:"edicionRecurso"}}]},{path:"/admin/users",name:"Usuarios",component:function(){return Promise.all([n.e("chunk-7045d9e3"),n.e("chunk-21fece4f"),n.e("usermanagement")]).then(n.bind(null,"1d56"))},redirect:{name:"UserList"},meta:{requiresAuth:!0,is_admin:!0,title:"Usuario",link_name:"Usuarios"},children:[{path:"",name:"UserList",component:function(){return Promise.all([n.e("chunk-7045d9e3"),n.e("chunk-21fece4f"),n.e("UserList")]).then(n.bind(null,"ab3a"))},meta:{requiresAuth:!0,is_admin:!0,title:"Usuarios",link_name:"Gestión de Usuarios"}},{path:"add",name:"CrearUsuario",component:function(){return n.e("useradd").then(n.bind(null,"868c"))},meta:{requiresAuth:!0,title:"Crear usuario",is_admin:!0,link_name:"Crear Usuario"}},{path:"edit/:id",name:"EditarUsuario",component:function(){return n.e("useradd").then(n.bind(null,"868c"))},meta:{requiresAuth:!0,is_admin:!0,title:"Editar usuario",link_name:"Editar Usuario"}}]},{path:"/admin/news",name:"NewsManagement",component:function(){return n.e("chunk-2d2100b6").then(n.bind(null,"b5e2"))},meta:{requiresAuth:!0,is_admin:!0,title:"Noticias",link_name:"Noticias"},redirect:{name:"NewsList"},children:[{path:"",name:"NewsList",component:function(){return Promise.all([n.e("chunk-7045d9e3"),n.e("chunk-21fece4f"),n.e("chunk-3398408e")]).then(n.bind(null,"b7a7"))},meta:{requiresAuth:!0,is_admin:!0,title:"Noticias",link_name:"Noticias"}},{path:"add",name:"CrearNoticia",component:function(){return n.e("useradd").then(n.bind(null,"cce6"))},meta:{requiresAuth:!0,is_admin:!0,title:"Crear noticia"}},{path:"edit/:id",name:"EditarNoticia",component:function(){return n.e("useradd").then(n.bind(null,"cce6"))},meta:{requiresAuth:!0,link_name:"Editar Noticia",is_admin:!0,title:"Editar noticia"}}]},{path:"/admin/shows/scan",name:"ScanShows",component:function(){return n.e("chunk-41beee16").then(n.bind(null,"241a"))},meta:{requiresAuth:!0,is_admin:!0,link_name:"Editar Noticia",title:"Escanear entradas"}},{path:"/admin/shows",name:"ShowsManagement",component:function(){return n.e("chunk-2d0b377e").then(n.bind(null,"2901"))},meta:{requiresAuth:!0,is_admin:!0,link_name:"Shows",title:"Shows"},redirect:{name:"ShowsList"},children:[{path:"",name:"ShowsList",component:function(){return Promise.all([n.e("chunk-7045d9e3"),n.e("chunk-33c46e00")]).then(n.bind(null,"0d75"))},meta:{requiresAuth:!0,is_admin:!0,link_name:"Shows",title:"Shows"}},{path:"add",name:"CrearShow",component:function(){return n.e("useradd").then(n.bind(null,"4ef5"))},meta:{requiresAuth:!0,is_admin:!0,link_name:"Crear show",title:"Nuevo show"}},{path:"edit/:id",name:"EditarShow",component:function(){return n.e("useradd").then(n.bind(null,"4ef5"))},meta:{requiresAuth:!0,is_admin:!0,link_name:"Editar Show",title:"Editar Show"}}]}],Ce=new te["a"]({mode:"history",base:"/",routes:ye});Ce.beforeEach((function(e,t,n){if(document.title=e.meta.title,console.log("to",e),console.log("from",t),console.log("from",t),e.matched.some((function(e){return e.meta.requiresAuth})))if(console.log("1"),null==localStorage.getItem("jwt"))console.log("2"),n({name:"Login",params:{nextUrl:e.fullPath}});else{console.log("3");var a=JSON.parse(localStorage.getItem("user"));console.log(a),e.matched.some((function(e){return e.meta.is_admin}))?(console.log("4"),a.rolesUser.map((function(e){return e.id})).includes(1)?(console.log("5"),n()):(console.log("6"),n({name:"Home"}))):(console.log("7"),n())}else e.matched.some((function(e){return e.meta.guest}))?(console.log("8"),null==localStorage.getItem("jwt")?(console.log("9"),n()):(console.log("10"),n({name:"Home"}))):(console.log("10"),n())}));var Se=Ce,xe=n("ade3"),Ue=n("1da1"),Ne=(n("96cf"),n("a434"),n("2f62"));a["default"].use(Ne["a"]);var Pe=new Ne["a"].Store(Object(xe["a"])({modules:{},state:{resources:[],songs:[],users:[],musicalResourceTypes:[],currentUser:window.localStorage.getItem("user")?JSON.parse(window.localStorage.getItem("user")):null},mutations:{setUsers:function(e,t){e.users=t},setSongs:function(e,t){e.songs=t},setCurrentUser:function(e,t){e.currentUser=t},deletedUser:function(e,t){var n=e.users.map((function(e){return e.id})).indexOf(t);n>-1&&e.users.splice(n,1)},deletedResource:function(e,t){var n=e.resources.map((function(e){return e.id})).indexOf(t);n>-1&&e.resources.splice(n,1)},setResources:function(e,t){e.resources=t},setMusicalResourceTypes:function(e,t){e.musicalResourceTypes=t}},actions:{fetchMusicalResourceTypes:function(e){var t=re["a"].get("/api/mr_types");return t.then((function(t){e.commit("setMusicalResourceTypes",t.data)})),t},fetchResources:function(e){var t=re["a"].get("/api/musical_resources");return t.then((function(t){e.commit("setResources",t.data)})),t},getResource:function(e,t){var n=re["a"].get("/api/musical_resources/",{params:{id:t}});return n},fetchSongs:function(e){var t=re["a"].get("/api/songs");return t.then((function(t){e.commit("setSongs",t.data)})),t},getUsers:function(e){var t=re["a"].get("/api/users");return t.then((function(t){e.commit("setUsers",t.data)})),t},deleteUser:function(e,t){var n=re["a"].delete("/api/users/",{params:{id:t}});n.then((function(e){})).catch((function(e){console.log(e)}))},deleteResource:function(e,t){var n=re["a"].delete("/api/musical_resources/",{params:{id:t}});n.then((function(n){e.commit("deletedResource",t)})).catch((function(e){console.log(e)}))},deleteNew:function(e,t){var n=re["a"].delete("/api/news/",{params:{id:t}});n.catch((function(e){console.log(e)}))},login:function(e,t){return Object(Ue["a"])(regeneratorRuntime.mark((function n(){var a,r,s,i,o;return regeneratorRuntime.wrap((function(n){while(1)switch(n.prev=n.next){case 0:return a=t.username,r=t.password,n.prev=1,n.next=4,re["a"].post("/api/login",{username:a,password:r});case 4:return s=n.sent,i=s.data,console.log(i),window.localStorage.setItem("jwt",i.jwt),n.next=10,re["a"].get("/api/users",{params:{username:i.username}});case 10:return o=n.sent,window.localStorage.setItem("user",JSON.stringify(o.data)),e.commit("setCurrentUser",o.data),n.abrupt("return",s);case 16:n.prev=16,n.t0=n["catch"](1);case 18:case"end":return n.stop()}}),n,null,[[1,16]])})))()},logout:function(e){e.commit("setCurrentUser",null),window.localStorage.removeItem("user"),window.localStorage.removeItem("jwt")},addMusicalResource:function(e,t){re["a"].post("/api/musical_resources",t)},addSong:function(e,t){var n=re["a"].post("/api/songs",t);return n}},getters:{users:function(e){var t=e.users;return t},songs:function(e){var t=e.songs;return t},currentUser:function(e){var t=e.currentUser;return t},currentUserIsAdmin:function(e){var t=e.currentUser;return t.rolesUser.map((function(e){return e.id})).includes(1)},resources:function(e){var t=e.resources;return t},musicalResourceTypes:function(e){var t=e.musicalResourceTypes;return t},isLoggedIn:function(e){var t=e.currentUser;return null!==t}}},"modules",{})),Ae=n("5f5b"),Oe=(n("9537"),n("3e48"),n("ab8b"),n("2dd8"),n("cf4f"),n("e607"),n("8e5f")),Le=n.n(Oe),Ee=n("c1df"),Re=n.n(Ee),qe={filters:{date:function(e){var t=arguments.length>1&&void 0!==arguments[1]?arguments[1]:"DD/MM/YYYY";return Re()(e).format(t)},datetime:function(e){var t=arguments.length>1&&void 0!==arguments[1]?arguments[1]:"DD/MM/YYYY HH:mm";return Re()(e).format(t)}}},Te=n("2b33"),Ie=n("dfcf"),$e=n("f309");a["default"].use($e["a"]);var Me=new $e["a"]({}),ze=n("1dce"),De=n.n(ze);a["default"].component("qr-code",Ie["a"]),a["default"].use(Ae["a"]),a["default"].component("text-input",Te["a"]),a["default"].component("multiselect",Le.a),a["default"].use(me.a),a["default"].use(De.a),a["default"].config.productionTip=!1,a["default"].mixin(qe),new a["default"]({router:Se,store:Pe,vuetify:Me,render:function(e){return e(ee)}}).$mount("#app")},"5c0b":function(e,t,n){"use strict";n("9c0c")},"99eb":function(e,t,n){},"9c0c":function(e,t,n){},a7e2:function(e,t,n){"use strict";n("dac2")},a87c:function(e,t,n){"use strict";n("d665")},cabf:function(e,t,n){},cc02:function(e,t,n){"use strict";n("cabf")},cf05:function(e,t,n){e.exports=n.p+"img/logo.f0df2a7c.png"},d3eb:function(e,t,n){"use strict";n("0c6c")},d665:function(e,t,n){},dac2:function(e,t,n){},e873:function(e,t,n){"use strict";n("54d0")},eac4:function(e,t,n){},f2bc:function(e,t,n){}});
//# sourceMappingURL=app.fe3b858b.js.map