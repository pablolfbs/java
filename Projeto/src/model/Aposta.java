package model;

public class Aposta {
	
	public class Client {

		private String jogo;

		private String dataPartida;

		public Client(String jogo, String dataPartida) {
			super();
			this.jogo = jogo;
			this.dataPartida = dataPartida;
		}

		public String getJogo() {
			return jogo;
		}

		public void setJogo(String jogo) {
			this.jogo = jogo;
		}

		public String getDataPartida() {
			return dataPartida;
		}

		public void setDataPartida(String dataPartida) {
			this.dataPartida = dataPartida;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((jogo == null) ? 0 : jogo.hashCode());
			return result;
		}

//		@Override
//		public boolean equals(Object obj) {
//			if (this == obj)
//				return true;
//			if (obj == null)
//				return false;
//			if (getClass() != obj.getClass())
//				return false;
//			Client other = (Client) obj;
//			if (jogo == null) {
//				if (other.jogo != null)
//					return false;
//			} else if (!jogo.equals(other.jogo))
//				return false;
//			return true;
//		}
	}
}
