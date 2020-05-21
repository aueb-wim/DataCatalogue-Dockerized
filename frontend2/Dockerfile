#Stage 1: Build an Angular Docker Image
FROM node:8.12.0 as build

WORKDIR /app
COPY package*.json /app/
RUN npm install
RUN npm install @angular/cli@6.2.3
COPY . /app
ARG configuration=production
#--base-href=/datacatalogue --deploy-url /datacatalogue/
RUN npm run build -- --outputPath=./dist/out --configuration $configuration

# Stage 2, use the compiled app, ready for production with Nginx
FROM nginx
COPY --from=build /app/dist/out/ /usr/share/nginx/html
COPY /nginx-custom.conf /etc/nginx/conf.d/default.conf
