public class OrientadaObjetos {
    public class Ponto {
//atributos da classe
        private int x;
        private int y;
//construtores   
        public Ponto(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public Ponto() {
            this.x = 0;
            this.y = 0;
        }
//métodos        
        public boolean equals(Ponto outroPonto) {
            return this.x == outroPonto.x && this.y == outroPonto.y;
        }
        public double distancia(Ponto outroPonto) {
            int difX = this.x - outroPonto.x;
            int difY = this.y - outroPonto.y;
            return Math.sqrt(difX * difX + difY * difY);
        }
    }
    
}
/*
O primeiro construtor recebe dois parâmetros x e y e atribui esses valores aos atributos this.x e this.y, respectivamente.

O segundo construtor não recebe parâmetros e inicializa os atributos this.x e this.y com o valor zero.

O método equals recebe um objeto Ponto como parâmetro e verifica se seus valores de x e y são iguais aos valores do objeto que chamou o método. O método retorna true se ambos os pontos possuem os mesmos valores para x e y, ou false caso contrário.

Já o método distancia recebe um objeto Ponto como parâmetro e calcula a distância euclidiana entre os dois pontos. O cálculo é feito através da fórmula d = sqrt((x2-x1)^2 + (y2-y1)^2). O método retorna um valor do tipo double correspondente à distância entre os dois pontos.
 */