from PIL import Image


def inverter_imagem_horizontal(caminho_imagem):
    imagem = Image.open(caminho_imagem)

    imagem_invertida = imagem.transpose(Image.FLIP_LEFT_RIGHT)

    caminho_imagem_invertida_h = caminho_imagem.replace('.jpg', '_invertida_h.jpg')

    imagem_invertida.save(caminho_imagem_invertida_h)

    return caminho_imagem_invertida_h


def inverter_imagem_vertical(caminho_imagem):
    imagem = Image.open(caminho_imagem)

    imagem_invertida = imagem.transpose(Image.FLIP_TOP_BOTTOM)

    caminho_imagem_invertida_v = caminho_imagem.replace('.jpg', '_invertida_v.jpg')

    imagem_invertida.save(caminho_imagem_invertida_v)

    return caminho_imagem_invertida_v

caminho_imagem = 'Computer-Graphics/10-Image_Flip/dog.jpg'
caminho_imagem_invertida_h = inverter_imagem_horizontal(caminho_imagem)
print("Caminho da imagem invertida horizontalmente:", caminho_imagem_invertida_h)
caminho_imagem_invertida_v = inverter_imagem_vertical(caminho_imagem)
print("Caminho da imagem invertida verticalmente:", caminho_imagem_invertida_v)
