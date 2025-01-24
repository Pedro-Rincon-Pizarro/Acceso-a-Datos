using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CrudAlmacen.modelo
{
    internal class Producto
    {
        private int id_producto;
        private String nombre;
        private float precio;
        private int cantidad;
        private byte[] imagen;

        public Producto(int id_producto, string nombre, float precio, int cantidad, byte[] imagen)
        {
            this.id_producto = id_producto;
            this.nombre = nombre;
            this.precio = precio;
            this.cantidad = cantidad;
            this.imagen = imagen;
        }

        public int Id_producto { get => id_producto; set => id_producto = value; }
        public string Nombre { get => nombre; set => nombre = value; }
        public float Precio { get => precio; set => precio = value; }
        public int Cantidad { get => cantidad; set => cantidad = value; }
        public byte[] Imagen { get => imagen; set => imagen = value; }
    }
}
