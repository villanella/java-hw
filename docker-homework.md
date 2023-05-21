1. установите докер для вашей операционной системы.
2. выполните docker run hello-world
```
$ sudo docker run hello-world
[sudo] пароль для krupenkina:
Unable to find image 'hello-world:latest' locally
latest: Pulling from library/hello-world
719385e32844: Pull complete
Digest: sha256:fc6cf906cbfa013e80938cdf0bb199fbdbb86d6e3e013783e5a766f50f5dbce0
Status: Downloaded newer image for hello-world:latest

Hello from Docker!
This message shows that your installation appears to be working correctly.
```
3. убедитесь, что видите строки:
```
Hello from Docker!
This message shows that your installation appears to be working correctly.
```
+
4. узнайте размер образа hello-world
```
# docker images hello-world
REPOSITORY    TAG       IMAGE ID       CREATED       SIZE
hello-world   latest    9c7a54a9a43c   2 weeks ago   13.3kB
```

5. посмотрите какие контейнеры сейчас запущены
```
# docker ps
CONTAINER ID   IMAGE     COMMAND   CREATED   STATUS    PORTS     NAMES
```
6. в одной консоли: выполните docker run -it ubuntu bash  +
7. в другой консоли еще раз посмотрите работающие контейнеры,
убедитесь, что есть контейнер с образом ubuntu
```
# docker ps
CONTAINER ID   IMAGE     COMMAND   CREATED         STATUS         PORTS     NAMES
65aa7653aab5   ubuntu    "bash"    9 seconds ago   Up 8 seconds             wonderful_keldysh
```
8. вернитесь в консоль, где вы запустили "docker run -it ubuntu bash"
9. начните с выполнения команды ls, "походите" по файловой системе,
убедитесь, что это "какая-то другая" операционная система
```
root@65aa7653aab5:/# ls
bin   etc   lib32   media  proc  sbin  tmp
boot  home  lib64   mnt    root  srv   usr
dev   lib   libx32  opt    run   sys   var
```
10. перейдите в каталог home и в нем создайте новый каталог test
```
root@65aa7653aab5:/# cd home/
root@65aa7653aab5:/home# mkdir test
```
11. выполните exit и убедитесь, что вернулись в "свою" операционную систему
```
root@65aa7653aab5:/home# exit
exit
[root@krupenkina-wb ~]# ls
[root@krupenkina-wb ~]# ls /home
krupenkina  nkru  n_krupenkina_krb1
```
12. еще раз выполните docker run -it ubuntu bash +
13. перейдите к каталог home, убедитесь, что созданного вами каталога test нет
```
root@b4d86a758808:/# ls home
root@b4d86a758808:/#
```
14. очень важный пункт: подумайте, куда пропал каталог test
Зашли в другой контейнер, где нет этого каталога. Другой неймспейс, где своя файловая система.
15. запустите PostgreSQL 13.1 в докере
```
# docker run -p 5432:5432 -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=otus -v "$(pwd)/init_db":/docker-entrypoint-initdb.d -d --name my_postgres postgres:13.1
bbe83656209aefe1bb08ddc248b0de2ba3cc192037fec151d0743fdce9494d1a
```
16. подключитесь к запущенному контейнеру с базой.
`# docker exec -it my_postgres bash`
или через DBeaver localhost:5432
17. создайте таблицу tTestDoc с любыми полями
скрин приложен
18. остановите и удалите контейнер
```
# docker stop my_postgres
# docker rm my_postgres
```
19. еще раз запустите контейнер с базой

# docker run -p 5432:5432 -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=otus -v "$(pwd)/init_db":/docker-entrypoint-initdb.d -d --name my_postgres postgres:13.1

20. подключитесь к базе данных, убедитесь, что таблицы tTestDoc нет +

21. подумайте, почему пропала таблица
Потому что удалили контейнер, вместе с ним и базу.
22. остановите контейнер
`# docker stop my_postgres`

