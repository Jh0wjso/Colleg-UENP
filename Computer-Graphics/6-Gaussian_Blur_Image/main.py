from PIL import Image

def gaussian_blur(image, radius):
    width, height = image.size
    blurred_image = Image.new("RGB", (width, height))
    
    for x in range(width):
        for y in range(height):
            r_total, g_total, b_total = 0, 0, 0
            count = 0
            
            for dx in range(-radius, radius + 1):
                for dy in range(-radius, radius + 1):
                    nx = x + dx
                    ny = y + dy
                    
                    if 0 <= nx < width and 0 <= ny < height:
                        r, g, b = image.getpixel((nx, ny))
                        r_total += r
                        g_total += g
                        b_total += b
                        count += 1
            
            r_avg = r_total // count
            g_avg = g_total // count
            b_avg = b_total // count
            
            blurred_image.putpixel((x, y), (r_avg, g_avg, b_avg))
    
    return blurred_image

image_path = "/Computer-Graphics/4-Blur_Image/car.jpeg"
image = Image.open(image_path)

radius = 5
blurred_image = gaussian_blur(image, radius)

output_path = "/Computer-Graphics/4-Blur_Image/carro_blurred.jpg"
blurred_image.save(output_path)
 