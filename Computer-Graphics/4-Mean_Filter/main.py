from PIL import Image

def filtro_media(imagem, tamanho_janela):
    largura, altura = imagem.size
    pixels = imagem.load()
    nova_imagem = Image.new("RGB", (largura, altura))

    metade_janela = tamanho_janela // 2

    for y in range(altura):
        for x in range(largura):
            soma_r = 0
            soma_g = 0
            soma_b = 0
            count = 0

            for j in range(-metade_janela, metade_janela + 1):
                for i in range(-metade_janela, metade_janela + 1):
                    pixel_x = min(max(x + i, 0), largura - 1)
                    pixel_y = min(max(y + j, 0), altura - 1)
                    r, g, b = pixels[pixel_x, pixel_y]
                    soma_r += r
                    soma_g += g
                    soma_b += b
                    count += 1

            media_r = soma_r // count
            media_g = soma_g // count
            media_b = soma_b // count

            nova_imagem.putpixel((x, y), (media_r, media_g, media_b))

    return nova_imagem


# Caminho da imagem
caminho_imagem = '/home/jhonatan/Documentos/UENP/CG/4/pessoa.jpg'

# Carrega a imagem
imagem = Image.open(caminho_imagem)

# Define o tamanho da janela do filtro
tamanho_janela = 5

# Aplica o filtro da média na imagem
imagem_filtrada = filtro_media(imagem, tamanho_janela)

# Salva a imagem filtrada
caminho_imagem_filtrada = caminho_imagem.replace('.jpg', '_filtrada.jpg')
imagem_filtrada.save(caminho_imagem_filtrada)

# Imprime o caminho da imagem filtrada
print("Caminho da imagem filtrada:", caminho_imagem_filtrada)
