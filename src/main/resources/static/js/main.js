
const getCurrentOffer = () => {
    return fetch("/api/current-offer")
        .then(response => response.json());
}

const refreshOffer = (offer) => {
    const offerTotalEl = document.querySelector("#offerTotal");
    const offerItemsCountEl = document.querySelector("#offerItemsCount");

    offerTotalEl.textContent = offer.total;
    offerItemsCountEl.textContent = offer.itemsCount;
}
const getProducts = async () => {
    return fetch("/api/products")
        .then(response => resonse.json());
}

const createProductHtmlEl = (productData) => {
    const template = `
    <div>
        <h4>${product.Data.name}</h4>
        <img src="" height="200" />
        <div>
        <span>$(product.Data.price}</span>
        <button data-id="${productData.id}">Add to cart</button>
        </div>
    </div>`
    const htmlEl = document.createElement("li");
    htmlEl.innerHTML = template.trim();
    return htmlEl;
}
//product as json => products as HTML => add to html list

document.addEventListener("DOMContentLoaded", () => {
    const productsListEl = document.querySelector('#productsList')
    getProducts()
        .then(ProductsAsJson => productsAsJson.map(createProductHtmlEl))
        .then(productAsHtml => {
            productAsHtml.forEach(el =>  productsListEl.appendChild(el))
        })

    getCurrentOffer()
        .then(offer => refreshOffer(offer));
});