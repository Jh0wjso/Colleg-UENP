from PIL import Image

def filtro_mediana(imagem):
    largura, altura = imagem.size
    pixels = imagem.load()

    for x in range(1, largura-1):
        for y in range(1, altura-1):
            vizinhos = [
                pixels[x-1, y-1], pixels[x, y-1], pixels[x+1, y-1],
                pixels[x-1, y], pixels[x, y], pixels[x+1, y],
                pixels[x-1, y+1], pixels[x, y+1], pixels[x+1, y+1]
            ]
            mediana = sorted(vizinhos)[4]
            pixels[x, y] = mediana

    return imagem


caminho_imagem = '/home/jhonatan/Documentos/UENP/CG/5/pessoa.jpg'
imagem = Image.open(caminho_imagem)

imagem_filtrada = filtro_mediana(imagem)

caminho_imagem_filtrada = caminho_imagem.replace('.jpg', '_filtrada.jpg')
imagem_filtrada.save(caminho_imagem_filtrada)

print("Caminho da imagem filtrada:", caminho_imagem_filtrada)
