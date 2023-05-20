import cv2

# Função para separar os canais de cor
def separar_canais(imagem):
    # Divide a imagem em seus canais RGB
    canal_vermelho = imagem[:, :, 2]  # Red channel
    canal_verde = imagem[:, :, 1]  # Green channel
    canal_azul = imagem[:, :, 0]  # Blue channel

    return canal_vermelho, canal_verde, canal_azul

# Carrega a imagem
imagem = cv2.imread("/home/jhonatan/Documentos/UENP/CG/1/rgbImage.png")

# Verifica se a imagem foi carregada corretamente
if imagem is None:
    print('Erro ao carregar a imagem.')
    exit(1)

# Separa os canais de cor
vermelho, verde, azul = separar_canais(imagem)

# Mostra as imagens resultantes
cv2.imshow('Canal Vermelho', vermelho)
cv2.imshow('Canal Verde', verde)
cv2.imshow('Canal Azul', azul)
cv2.imshow('Imagem original', imagem)

# Aguarda a tecla 'q' ser pressionada para fechar as janelas
while cv2.waitKey(1) != ord('q'):
    pass

# Libera os recursos utilizados
cv2.destroyAllWindows()
