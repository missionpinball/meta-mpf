SUMMARY = "ffpyplayer for kivy"

PYPI_PACKAGE = "ffpyplayer"

LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=a4e826696844cc2163617e383971dde6"

DEPENDS = "virtual/libsdl2 libsdl2-image libsdl2-mixer libsdl2-net libsdl2-ttf python3-cython-native python3-pkgconfig-native ffmpeg"

inherit pypi setuptools3 python3native pkgconfig
 
SRC_URI[md5sum] = "0a3bc324193b1f2c214e780c0969b63c"
SRC_URI[sha256sum] = "0e7af171e8d8f97be218048461e88c4c64493d2bd0068b8835c05cb313614ada"

#do_compile_prepend() {
#    export SDL_ROOT="`pkg-config --cflags-only-I sdl2 | cut -c 3`"
#}


