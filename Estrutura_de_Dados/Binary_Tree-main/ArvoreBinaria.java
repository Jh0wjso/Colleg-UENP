public class ArvoreBinaria {

    Node raiz;

    public void insere(Node n){
        if (raiz == null){
            raiz = n;
            System.out.println("Inserido na raiz");
        }
        else{
            Node aux = raiz;
            while(aux!=null){
                if (n.getKey() > aux.getKey()){
                    Node filhoDir = aux.getFilhoDireita();
                    if (filhoDir!=null){
                        aux = aux.getFilhoDireita();
                    }
                    else{
                        aux.setFilhoDireita(n);
                        n.setPai(aux);
                        aux=null;
                        System.out.println("Inserido no filho a direita");
                    }
                }
                else{
                    Node filhoEsq = aux.getFilhoEsquerda();
                    if (filhoEsq!=null){
                        aux = aux.getFilhoEsquerda();
                    }
                    else{
                        aux.setFilhoEsquerda(n);
                        n.setPai(aux);
                        aux=null;
                        System.out.println("Inserido no filho a esquerda");
                    }
                }
            }
        }
    }

    public Node search(int buscar){
        Node aux = raiz;
        while(aux!=null){
            if (aux.getKey() == buscar)
                return aux;
            else if(buscar > aux.getKey()){
                aux = aux.getFilhoDireita();
            }
            else{
                aux = aux.getFilhoEsquerda();
            }
        }
        return null;
    }

    private Node getSucessor(Node delNode){
        Node sucessoorPai = delNode;
        Node sucessor = delNode;
        Node atual = delNode.getFilhoDireita();

        while (atual != null){
            sucessoorPai = sucessor;
            sucessor = atual;
            atual = atual.getFilhoEsquerda();
        }

        if (sucessor != delNode.getFilhoDireita()){
            sucessoorPai.setFilhoEsquerda(sucessor.getFilhoDireita());
            sucessor.setFilhoDireita(delNode.getFilhoDireita());
        }
        return sucessor;
    }

    public boolean remove(int key){
        Node atual = raiz;
        Node pai = raiz;
        boolean eFilhoEsquerda = true;

        while(atual.getKey() != key){
            pai = atual;
            if(key < atual.getKey()){
                eFilhoEsquerda = true;
                atual = atual.getFilhoEsquerda();
            }
            else{
                eFilhoEsquerda = false;
                atual = atual.getFilhoDireita();
            }
            if(atual == null){
                return false;
            }
        }
        if(atual.getFilhoEsquerda() ==null && atual.getFilhoDireita()== null){
            if (atual == raiz){
                raiz = null;
            }
            else if (eFilhoEsquerda){
                pai.filhoEsquerda = null;
            }
            else{
                pai.filhoDireita = null;
            }
        }
        else if(atual.getFilhoDireita() == null){
            if(raiz == null){
                raiz = atual.getFilhoEsquerda();
            }
            else if(eFilhoEsquerda){
                pai.filhoEsquerda = atual.getFilhoEsquerda();
            }
            else
                pai.filhoDireita = atual.getFilhoEsquerda();
        }
        else if(atual.getFilhoEsquerda() == null){
            if(atual == raiz){
                raiz = atual.getFilhoDireita();
            }
            else if(eFilhoEsquerda){
                pai.filhoEsquerda = atual.getFilhoDireita();
            }
            else
                pai.filhoDireita = atual.getFilhoDireita();
        }
        else{
            Node sucessor = getSucessor(atual);
            if(atual == raiz){
                raiz = sucessor;
            }
            else if(eFilhoEsquerda){
                pai.filhoEsquerda = sucessor;
            }
            else
                pai.filhoDireita = sucessor;
            sucessor.filhoEsquerda = atual.getFilhoEsquerda();
        }
        return true;
    }

    public void preOrdem(Node root){
        if (root!=null){
            System.out.println(root.toString());
            preOrdem(root.getFilhoEsquerda());
            preOrdem(root.getFilhoDireita());
        }
    }

    public void posOrdem(Node root){
        if (root!=null){
            posOrdem(root.getFilhoEsquerda());
            posOrdem(root.getFilhoDireita());
            System.out.println(root.toString());
        }
    }

    public void emOrdem(Node root){
        if (root!=null){
            emOrdem(root.getFilhoEsquerda());
            System.out.println(root.toString());
            emOrdem(root.getFilhoDireita());
        }
    }


}