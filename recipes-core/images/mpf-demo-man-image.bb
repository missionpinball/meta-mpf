SUMMARY = "MPF Demo Man Image"

inherit core-image features_check
  
IMAGE_FEATURES += "splash"

REQUIRED_DISTRO_FEATURES = "x11"

QB_MEM = '${@bb.utils.contains("DISTRO_FEATURES", "opengl", "-m 512", "-m 256", d)}'

LICENSE = "MIT"

CORE_IMAGE_EXTRA_INSTALL += " game-demo-man mpf-x-session packagegroup-core-x11-xserver packagegroup-core-x11-utils matchbox-wm pulseaudio-server alsa-plugin pulseaudio"
