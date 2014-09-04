SUMMARY = "A console-only image that fully supports the target device \
hardware."

IMAGE_FEATURES += "splash"

LICENSE = "MIT"

inherit core-image

# Include dev packages and ssh server

IMAGE_FEATURES += "dev-pkgs"

IMAGE_INSTALL += " dropbear"


# Add gstreamer for webcam

#GSTREAMER_EXTRA_INSTALL = " \
#     gst-plugins-good \
#     gst-plugins-base \
#     gst-meta-base \
#     gst-fsl-plugin \ 
#     gst-ffmpeg \    
#"

#IMAGE_INSTALL += " \
#     packagegroup-fsl-gstreamer \
#     packagegroup-fsl-tools-testapps \
#     packagegroup-fsl-tools-benchmark \
#     ${GSTREAMER_EXTRA_INSTALL} \
#"

IMAGE_INSTALL += " \
	opencv \
	make \
	gcc \
	binutils \
	boost \
	wpa-supplicant \
	openvpn \
	openvpn-config \
	nfs-utils \
	git \
"

EXTRA_IMAGE_FEATURES += " \
	tools-debug \
"
