import webbrowser

default_browser = 'chromium-browser'

def open_url(url):
    webbrowser.get(default_browser).open_new_tab(url)