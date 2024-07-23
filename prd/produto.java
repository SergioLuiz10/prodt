package prd;

public class produto {

        protected String produto;
        protected double price;

        public produto(String produto, double price) {
            this.produto = produto;
            this.price = price;
        }

        public String getProduto() {
            return produto;
        }

        public void setProduto(String produto) {
            this.produto = produto;
        }

        public double getPrice() {
            return price;
        }
        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return produto+","+price;
        }
    }

