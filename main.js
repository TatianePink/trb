// Obtém todas as imagens e textos
var imagens = document.getElementsByClassName("imagem");
var textos = document.getElementsByClassName("texto-escondido");

// Percorre todas as imagens e adiciona os ouvintes de eventos
for (var i = 0; i < imagens.length; i++) {
  imagens[i].addEventListener("click", toggleTexto);
}

// Função para exibir/ocultar o texto correspondente
function toggleTexto() {
  var texto = this.nextElementSibling;

  if (texto.style.display === "none") {
    texto.style.display = "block";
  } else {
    texto.style.display = "none";
  }
}
