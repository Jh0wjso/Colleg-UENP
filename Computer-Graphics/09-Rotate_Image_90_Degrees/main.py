from PIL import Image

def girar_imagem_90_graus(caminho_imagem):
    imagem = Image.open(caminho_imagem)

    imagem_girada = imagem.rotate(90, expand=True)

    caminho_imagem_girada = caminho_imagem.replace('.jpg', '_girada.jpg')

    imagem_girada.save(caminho_imagem_girada)

    return caminho_imagem_girada

caminho_imagem = 'Computer-Graphics/9-Rotate_Image_90_Degrees/dog.jpg'
caminho_imagem_girada = girar_imagem_90_graus(caminho_imagem)
print("Caminho da imagem girada:", caminho_imagem_girada)
