using System.Web;
using System.Web.Mvc;

namespace _2011064371_HoNguyenVietHai
{
    public class FilterConfig
    {
        public static void RegisterGlobalFilters(GlobalFilterCollection filters)
        {
            filters.Add(new HandleErrorAttribute());
        }
    }
}
