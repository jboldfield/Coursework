{"filter":false,"title":"index.js","tooltip":"/depot/app/javascript/catalog/index.js","ace":{"folds":[],"scrolltop":0,"scrollleft":0,"selection":{"start":{"row":10,"column":0},"end":{"row":10,"column":0},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":{"row":93,"mode":"ace/mode/javascript"}},"hash":"30f4f59d66c489b7cb2ba55cc351bd9e1efb0958","undoManager":{"mark":2,"position":2,"stack":[[{"start":{"row":5,"column":5},"end":{"row":9,"column":76},"action":"remove","lines":["onst catalog = document.querySelector(\"#catalog\");","    const cart_id = JSON.parse(catalog.getAttribute(\"cart_id\"));","    ReactDOM.render(<Catalog cart_id={cart_id} />, catalog);","    const seller = JSON.parse(catalog.getAttribute(\"seller\"));","    ReactDOM.render(<Catalog cart_id={cart_id} seller={seller} />, catalog);"],"id":9},{"start":{"row":5,"column":4},"end":{"row":5,"column":5},"action":"remove","lines":["c"]}],[{"start":{"row":5,"column":4},"end":{"row":8,"column":72},"action":"insert","lines":["const catalog = document.querySelector(\"#catalog\");","    const cart_id = JSON.parse(catalog.getAttribute(\"cart_id\"));","    const seller = JSON.parse(catalog.getAttribute(\"seller\"));","    ReactDOM.render(<App cart_id={cart_id} seller={seller} />, catalog);"],"id":10}],[{"start":{"row":0,"column":0},"end":{"row":9,"column":3},"action":"remove","lines":["import React from \"react\";","import ReactDOM from \"react-dom\";","import Catalog from \"./components/Catalog\";","","document.addEventListener(\"DOMContentLoaded\", () => {","    const catalog = document.querySelector(\"#catalog\");","    const cart_id = JSON.parse(catalog.getAttribute(\"cart_id\"));","    const seller = JSON.parse(catalog.getAttribute(\"seller\"));","    ReactDOM.render(<App cart_id={cart_id} seller={seller} />, catalog);","});"],"id":11},{"start":{"row":0,"column":0},"end":{"row":10,"column":0},"action":"insert","lines":["import React from \"react\";","import ReactDOM from \"react-dom\";","import App from './routes';","","document.addEventListener(\"DOMContentLoaded\", () => {","    const catalog = document.querySelector(\"#catalog\");","    const cart_id = JSON.parse(catalog.getAttribute(\"cart_id\"));","    const seller = JSON.parse(catalog.getAttribute(\"seller\"));","    ReactDOM.render(<App cart_id={cart_id} seller={seller} />, catalog);","});",""]}]]},"timestamp":1552528045620}