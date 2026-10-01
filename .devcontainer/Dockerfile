FROM mcr.microsoft.com/devcontainers/base:ubuntu

COPY .devcontainer/pulumi-dev.crt /usr/local/share/ca-certificates/pulumi-dev.crt
RUN update-ca-certificates
ENV NODE_EXTRA_CA_CERTS="/usr/local/share/ca-certificates/pulumi-dev.crt"
ENV REQUESTS_CA_BUNDLE="/etc/ssl/certs/ca-certificates.crt"
ENV SSL_CERT_FILE="/etc/ssl/certs/ca-certificates.crt"

# Install gh CLI
RUN apt-get update && apt-get install -y gh

# Install mise
ENV MISE_VERSION=2026.3.7
RUN curl https://mise.run | sh
ENV PATH="/root/.local/bin:${PATH}"

# Setup mise
WORKDIR /code
RUN mise install

# Activate mise in shell
RUN echo 'eval "$(mise activate bash)"' >> ~/.bashrc
