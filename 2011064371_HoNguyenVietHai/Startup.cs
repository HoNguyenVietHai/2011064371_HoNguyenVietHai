using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(_2011064371_HoNguyenVietHai.Startup))]
namespace _2011064371_HoNguyenVietHai
{
    public partial class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            ConfigureAuth(app);
        }
    }
}
