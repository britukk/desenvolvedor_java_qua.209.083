// declaração de variáveis globais

// var -> declara uma variável global
// let -> declara uma variável local (funcionam unica e exclusivamente dentro do evento)
// const -> declara uma variável constante (valor imutável)
const form = document.querySelector("form");

form.addEventListener("submit", function(event) {
    // desativando o submit
    event.preventDefault();

    // declaração de variáveis locais
    let texto = document.querySelector("#texto").value;

    // exibe o texto em forma de caixa de diálogo
    alert(texto);
});