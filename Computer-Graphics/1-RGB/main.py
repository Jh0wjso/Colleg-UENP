import cv2

def separar_canais(imagem):

    canal_vermelho = imagem[:, :, 2] 
    canal_verde = imagem[:, :, 1] 
    canal_azul = imagem[:, :, 0] 

    return canal_vermelho, canal_verde, canal_azul

imagem = cv2.imread("/Computer-Graphics/1-RGB/rgbImage.png")

if imagem is None:
    print('Erro ao carregar a imagem.')
    exit(1)

vermelho, verde, azul = separar_canais(imagem)

cv2.imshow('Canal Vermelho', vermelho)
cv2.imshow('Canal Verde', verde)
cv2.imshow('Canal Azul', azul)
cv2.imshow('Imagem original', imagem)

while cv2.waitKey(1) != ord('q'):
    pass

cv2.destroyAllWindows()
