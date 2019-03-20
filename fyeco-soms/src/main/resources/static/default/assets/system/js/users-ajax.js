var DatatableUsersAjax = {
    init: function() {
        var t;
        t = $(".m_datatable").mDatatable({
            data: {
            	// 数据获取类型 remote-远程/local-本地
                type: "remote",
                source: {
                    read: {
                        url: "http://localhost:8080/rest/v1/system/users",
                        method: 'GET',
                        // 自定义请求头参数
                        headers: {
                        	'x-my-custom-header': 'some value',
                        	'x-test-header': 'the value'
                        },
                        dataType:"json",
                     // params: { // 可选
	                     // 自定义参数
	                     // traditional: true,
						 // generalSearch: '',
						 // EmployeeID: 1,
						 // someParam: 'someValue',
						 // token: 'token-value'
					 // },
                        map: function(t) {
                            var e = t;
                            return void 0 !== t.data && (e = t.data),
                            e
                        },
                        // 请求超时时间 30秒
                        timeout: 30000
                    }
                },
                pageSize: 10,
                saveState: {
                    cookie: true,
                    webstorage: true
                },
                serverPaging: !0,
                serverFiltering: !0,
                serverSorting: !0,
                autoColumns: false
            },
            layout: {
                theme: "default",
                class: "m-datatable--brand",
                scroll: !1,
// height: 300,
                footer: !1,
// header: true,
                smoothScroll: {
                    scrollbarShown: true
                },
                spinner: {
                    overlayColor: '#000000',
                    opacity: 0,
                    type: 'loader',
                    state: 'brand',
                    message: true
                },
                icons: {
                    sort: {asc: 'la la-arrow-up', desc: 'la la-arrow-down'},
                    pagination: {
                        next: 'la la-angle-right',
                        prev: 'la la-angle-left',
                        first: 'la la-angle-double-left',
                        last: 'la la-angle-double-right',
                        more: 'la la-ellipsis-h'
                    },
                    rowDetail: {expand: 'fa fa-caret-down', collapse: 'fa fa-caret-right'}
                }
            },
            sortable: !0,
            pagination: !0,
            // 工具栏
            toolbar: {
                layout: ['pagination', 'info'],
                placement: ['bottom'],  // 'top', 'bottom'
                items: {
                    pagination: {
                        type: 'default',
                        pages: {
                            desktop: {
                                layout: 'default',
                                pagesNumber: 6
                            },
                            tablet: {
                                layout: 'default',
                                pagesNumber: 3
                            },
                            mobile: {
                                layout: 'compact'
                            }
                        },
                        navigation: {
                            prev: true,
                            next: true,
                            first: true,
                            last: true
                        },
                        pageSizeSelect: [10, 20, 30, 50, 100],
                        info: true
                    }
                }
            },
            search: {
                // enable trigger search by keyup enter
                onEnter: false,
                // input text for search
                input: $("#generalSearch"),
                // search delay in milliseconds
                delay: 400
            },
            detail: {
                title: 'Load sub table',
                content: function (e) {
                    // e.data
                    // e.detailCell
                }
            },
            rows: {
                callback: function(t, e, a) {},
                beforeTemplate: function (row, data, index) {
                },
                afterTemplate: function (row, data, index) {
                },
                // auto hide columns, if rows overflow. work on non locked
				// columns
	            autoHide: false
            },
            extensions: {
	            checkbox: {
	                vars: {
	                  selectedAllRows: 'selectedAllRows',
	                  requestIds: 'requestIds',
	                  rowIds: 'meta.rowIds',
	                },
	             },
	          },

            translate: {
                records: {
                    processing: 'Please wait...',
                    noRecords: 'No records found'
                },
                toolbar: {
                    pagination: {
                        items: {
                            default: {
                                first: '首页',
                                prev: '上一页',
                                next: '下一页',
                                last: '尾页',
                                more: '更多页',
                                input: '页码',
                                select: '选择页面大小'
                            },
                            info: '显示 {{start}} - {{end}} 条，共 {{total}} 条记录'
                        }
                    }
                }
            },
         // columns definition
            columns: [{
                field: "id",
                title: "#",
                locked: {left: 'xl'},
                sortable: !1,
                width: 40,
                textAlign: "center",
                selector: {
                    class: "m-checkbox--solid m-checkbox--brand"
                }
            },
            {
                width: 150,
                field: "avatar",
                title: "头像",
                locked: {left: 'xl'},
                template: function(t) {
// var e = mUtil.getRandomInt(1, 14);
                    if ((typeof t.avatar != "undifined") && (typeof t.avatar.valueOf() == "string") && (t.avatar.length>0)) output = '<div class="m-card-user m-card-user--sm">\t\t\t\t\t\t\t\t<div class="m-card-user__pic">\t\t\t\t\t\t\t\t\t<img src="' + t.avatar + '" class="m--img-rounded m--marginless" alt="photo">\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t<div class="m-card-user__details">\t\t\t\t\t\t\t\t\t<span class="m-card-user__name">' + t.nickname + '</span>\t\t\t\t\t\t\t\t\t<a href="" class="m-card-user__email m-link">' + t.updateTime + "</a>\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t</div>";
                    else {
                        var a = mUtil.getRandomInt(0, 7);
                        output = '<div class="m-card-user m-card-user--sm">\t\t\t\t\t\t\t\t<div class="m-card-user__pic">\t\t\t\t\t\t\t\t\t<div class="m-card-user__no-photo m--bg-fill-' + ["success", "brand", "danger", "accent", "warning", "metal", "primary", "info"][a] + '"><span>' + t.username.substring(0, 1) + '</span></div>\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t<div class="m-card-user__details">\t\t\t\t\t\t\t\t\t<span class="m-card-user__name">' + t.nickname + '</span>\t\t\t\t\t\t\t\t\t<a href="" class="m-card-user__email m-link">' + t.updateTime + "</a>\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t</div>"
                    }
                    return output
                }
            },
            {
                field: "username",
                title: "用户名",
                filterable: !1,
                width: 100
// ,
// template: "{{OrderID}} - {{ShipCountry}}"
            },
// {
// field: "password",
// title: "密码",
// attr: {
// nowrap: "nowrap"
// },
// width: 80,
// template: function(t) {
// return "********"
// }
// },
            {
                field: "email",
                title: "邮件",
                width: 180,
                template: function(t) {
                    return '<a class="m-link" href="mailto:' + t.email + '">' + t.email + "</a>"
                }
            },
// {
// field: "nickname",
// title: "昵称",
// width: 120
// },
// {
// field: "ShipDate",
// title: "Ship Date",
// type: "date",
// format: "MM/DD/YYYY"
// },
// {
// field: "Latitude",
// title: "Latitude",
// type: "number"
// },
            {
                field: "status",
                title: "状态",
                template: function(t) {
                    var e = {
                        0 : {
                            title: "已冻结",
                            class: "m-badge--danger"
                        },
                        1 : {
                            title: "未激活",
                            class: "m-badge--warning"
                        },
                        2 : {
                            title: "已激活",
                            class: "m-badge--success"
                        }
                    };
                    return '<span class="m-badge ' + e[t.status+1].class + ' m-badge--wide">' + e[t.status+1].title + "</span>"
                }
            },
            {
                field: "creator",
                title: "创建者",
                width: 120
            },
            {
                field: "createTime",
                title: "创建时间",
                type: "date",
                format: "YYYY/MM/DD"
            },
            {
                field: "deleted",
                title: "删除标识",
                template: function(t) {
                    var e = {
                        1 : {
                            title: "未删除",
                            state: "success"
                        },
                        2 : {
                            title: "已删除",
                            state: "danger"
                        }
                    };
                    return '<span class="m-badge m-badge--' + e[t.deleted+1].state + ' m-badge--dot"></span>&nbsp;<span class="m--font-bold m--font-' + e[t.deleted+1].state + '">' + e[t.deleted+1].title + "</span>"
                }
            },
            {
                field: "deleteTime",
                title: "删除时间",
                type: "date",
                format: "YYYY/MM/DD"
            },
// {
// field: "updateTime",
// title: "更新时间",
// type: "date",
// format: "MM/DD/YYYY"
// },
            {
                field: "actions",
                width: 110,
                title: "操作",
                sortable: !1,
                overflow: "visible",
                template: function(t, e, a) {
                    return '\t\t\t\t\t\t<div class="dropdown ' + (a.getPageSize() - e <= 4 ? "dropup": "") + '">\t\t\t\t\t\t\t<a href="#" class="btn m-btn m-btn--hover-accent m-btn--icon m-btn--icon-only m-btn--pill" data-toggle="dropdown">                                <i class="la la-ellipsis-h"></i>                            </a>\t\t\t\t\t\t  \t<div class="dropdown-menu dropdown-menu-right">\t\t\t\t\t\t    \t<a class="dropdown-item" href="#"><i class="la la-edit"></i> Edit Details</a>\t\t\t\t\t\t    \t<a class="dropdown-item" href="#"><i class="la la-leaf"></i> Update Status</a>\t\t\t\t\t\t    \t<a class="dropdown-item" href="#"><i class="la la-print"></i> Generate Report</a>\t\t\t\t\t\t  \t</div>\t\t\t\t\t\t</div>\t\t\t\t\t\t<a href="#" class="m-portlet__nav-link btn m-btn m-btn--hover-accent m-btn--icon m-btn--icon-only m-btn--pill" title="Edit details">\t\t\t\t\t\t\t<i class="la la-edit"></i>\t\t\t\t\t\t</a>\t\t\t\t\t\t<a href="#" class="m-portlet__nav-link btn m-btn m-btn--hover-danger m-btn--icon m-btn--icon-only m-btn--pill" title="Delete">\t\t\t\t\t\t\t<i class="la la-trash"></i>\t\t\t\t\t\t</a>\t\t\t\t\t'
                }
            }]
        }),
        $("#m_form_status").on("change",
        function() {
            t.search($(this).val(), "status")
        }),
        $("#m_form_deleted").on("change",
        function() {
            t.search($(this).val(), "deleted")
        }),
        $("#m_form_status, #m_form_deleted").selectpicker()
    }
};
jQuery(document).ready(function() {
    DatatableUsersAjax.init()
});