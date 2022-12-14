PGDMP     4    "                z            securitygroup    14.5    14.5                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    16395    securitygroup    DATABASE     m   CREATE DATABASE securitygroup WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Spanish_Venezuela.1252';
    DROP DATABASE securitygroup;
                postgres    false            ?            1259    16480 
   asistencia    TABLE       CREATE TABLE public.asistencia (
    cedulavigilante character varying(40) NOT NULL,
    mes character varying(15) NOT NULL,
    anio character varying(6) NOT NULL,
    inasistencia integer NOT NULL,
    inasistenciajus integer NOT NULL,
    estado character varying(1) NOT NULL
);
    DROP TABLE public.asistencia;
       public         heap    postgres    false            ?            1259    16398    cliente    TABLE     [  CREATE TABLE public.cliente (
    rif character varying(50) NOT NULL,
    nombre character varying(50) NOT NULL,
    descripcion character varying(250) NOT NULL,
    telefono character varying(50) NOT NULL,
    direccion character varying(250) NOT NULL,
    tipocliente character varying(50) NOT NULL,
    estatus character varying(1) NOT NULL
);
    DROP TABLE public.cliente;
       public         heap    postgres    false            ?            1259    16488    factura    TABLE     "  CREATE TABLE public.factura (
    idfactura character varying(50) NOT NULL,
    idservicio character varying(50) NOT NULL,
    fechafactura date NOT NULL,
    montofactura double precision NOT NULL,
    rifcliente character varying(50) NOT NULL,
    estado character varying(1) NOT NULL
);
    DROP TABLE public.factura;
       public         heap    postgres    false            ?            1259    16457    herramienta    TABLE     ?   CREATE TABLE public.herramienta (
    cantidad integer NOT NULL,
    tipoherramienta character varying(20) NOT NULL,
    mantenimiento double precision NOT NULL,
    precio double precision NOT NULL,
    estado character varying(1) NOT NULL
);
    DROP TABLE public.herramienta;
       public         heap    postgres    false            ?            1259    16483    servicio    TABLE       CREATE TABLE public.servicio (
    id character varying(20) NOT NULL,
    descripcion character varying(250) NOT NULL,
    fechainicio character varying(20) NOT NULL,
    rif character varying(20) NOT NULL,
    cantidadvigi integer NOT NULL,
    cantidadbici integer NOT NULL,
    cantidadradio integer NOT NULL,
    costo double precision NOT NULL,
    monto double precision NOT NULL,
    preciobici double precision NOT NULL,
    precioradio double precision NOT NULL,
    estado character varying(1) NOT NULL
);
    DROP TABLE public.servicio;
       public         heap    postgres    false            ?            1259    16469 	   vigilante    TABLE     ?  CREATE TABLE public.vigilante (
    cedula character varying(50) NOT NULL,
    nombre character varying(50) NOT NULL,
    apellido character varying(50) NOT NULL,
    direccion character varying(50) NOT NULL,
    correo character varying(50) NOT NULL,
    telefono character varying(12) NOT NULL,
    fechanacimiento date NOT NULL,
    sueldo double precision NOT NULL,
    estado character varying(1) NOT NULL
);
    DROP TABLE public.vigilante;
       public         heap    postgres    false                      0    16480 
   asistencia 
   TABLE DATA           g   COPY public.asistencia (cedulavigilante, mes, anio, inasistencia, inasistenciajus, estado) FROM stdin;
    public          postgres    false    212   U                 0    16398    cliente 
   TABLE DATA           f   COPY public.cliente (rif, nombre, descripcion, telefono, direccion, tipocliente, estatus) FROM stdin;
    public          postgres    false    209   r       	          0    16488    factura 
   TABLE DATA           h   COPY public.factura (idfactura, idservicio, fechafactura, montofactura, rifcliente, estado) FROM stdin;
    public          postgres    false    214   ?                 0    16457    herramienta 
   TABLE DATA           _   COPY public.herramienta (cantidad, tipoherramienta, mantenimiento, precio, estado) FROM stdin;
    public          postgres    false    210   ?                 0    16483    servicio 
   TABLE DATA           ?   COPY public.servicio (id, descripcion, fechainicio, rif, cantidadvigi, cantidadbici, cantidadradio, costo, monto, preciobici, precioradio, estado) FROM stdin;
    public          postgres    false    213   ?                 0    16469 	   vigilante 
   TABLE DATA           {   COPY public.vigilante (cedula, nombre, apellido, direccion, correo, telefono, fechanacimiento, sueldo, estado) FROM stdin;
    public          postgres    false    211          p           2606    16404    cliente cliente_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT cliente_pkey PRIMARY KEY (rif);
 >   ALTER TABLE ONLY public.cliente DROP CONSTRAINT cliente_pkey;
       public            postgres    false    209            x           2606    16492    factura factura_pkey 
   CONSTRAINT     Y   ALTER TABLE ONLY public.factura
    ADD CONSTRAINT factura_pkey PRIMARY KEY (idfactura);
 >   ALTER TABLE ONLY public.factura DROP CONSTRAINT factura_pkey;
       public            postgres    false    214            r           2606    16503    herramienta herramienta_pkey 
   CONSTRAINT     g   ALTER TABLE ONLY public.herramienta
    ADD CONSTRAINT herramienta_pkey PRIMARY KEY (tipoherramienta);
 F   ALTER TABLE ONLY public.herramienta DROP CONSTRAINT herramienta_pkey;
       public            postgres    false    210            v           2606    16487    servicio servicio_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.servicio
    ADD CONSTRAINT servicio_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.servicio DROP CONSTRAINT servicio_pkey;
       public            postgres    false    213            t           2606    16473    vigilante vigilante_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.vigilante
    ADD CONSTRAINT vigilante_pkey PRIMARY KEY (cedula);
 B   ALTER TABLE ONLY public.vigilante DROP CONSTRAINT vigilante_pkey;
       public            postgres    false    211                  x?????? ? ?            x?????? ? ?      	      x?????? ? ?         /   x?35?JL???42 "NG.N??????ԒD???P4F??? ?~	?            x?????? ? ?            x?????? ? ?     