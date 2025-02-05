using System;
using System.Collections.Generic;
using System.Drawing.Imaging;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ModernGUI_V3.modelo
{
    public class Commun
    {
        public static int ROW_HEIGTH = 40;
        public byte[] ImageToByteArray(Image mImage)
        {
            if (mImage == null)
                return null;

            MemoryStream mMemoryStream = new MemoryStream();
            mImage.Save(mMemoryStream, ImageFormat.Png);
            return mMemoryStream.ToArray();
        }

        public Image BitmapToImage(Bitmap bitmap)
        {
            MemoryStream memoryStream = new MemoryStream();
            bitmap.Save(memoryStream, ImageFormat.Png);
            return Image.FromStream(memoryStream);
        }
    }
}
