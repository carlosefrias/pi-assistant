import browser_laucher as bl 
import sys

piracy = 'https://v1.mrpiracy.xyz/'
youtube = 'www.youtube.com'
sports = 'idimsports.eu'
google = 'www.google.pt'

site = google
tema = sys.argv[1]

if (tema == 'filmes'):
    site = piracy
elif (tema == 'futebol'):
    site = sports
elif (tema == 'youtube'):
    site = youtube

print("A abrir site: " + site)
bl.open_url(site)