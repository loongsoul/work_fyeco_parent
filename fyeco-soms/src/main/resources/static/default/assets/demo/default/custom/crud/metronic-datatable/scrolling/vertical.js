var DefaultDatatableDemo = {
    init: function() {
        $(".m_datatable").mDatatable({
            data: {
                type: "remote",
                source: {
                    read: {
                        url: "https://keenthemes.com/metronic/themes/themes/metronic/dist/preview/inc/api/datatables/demos/default.php"
                    }
                },
                pageSize: 20,
                serverPaging: !0,
                serverFiltering: !0,
                serverSorting: !0
            },
            layout: {
                theme: "default",
                class: "",
                scroll: !0,
                height: 550,
                footer: !1
            },
            sortable: !0,
            filterable: !1,
            pagination: !0,
            search: {
                input: $("#generalSearch")
            },
            columns: [{
                field: "RecordID",
                title: "#",
                sortable: !1,
                width: 40,
                selector: {
                    class: "m-checkbox--solid m-checkbox--brand"
                }
            },
            {
                field: "OrderID",
                title: "Order ID",
                sortable: "asc",
                filterable: !1,
                width: 150,
                template: "{{OrderID}} - {{ShipCountry}}"
            },
            {
                field: "ShipName",
                title: "Ship Name",
                width: 150,
                responsive: {
                    visible: "lg"
                }
            },
            {
                field: "ShipDate",
                title: "Ship Date"
            },
            {
                field: "CompanyEmail",
                title: "Email",
                width: 150,
                responsive: {
                    visible: "lg"
                }
            },
            {
                field: "CompanyAgent",
                title: "Agent",
                responsive: {
                    visible: "lg"
                }
            },
            {
                field: "Status",
                title: "Status",
                width: 100,
                template: function(t) {
                    var e = {
                        1 : {
                            title: "Pending",
                            class: "m-badge--brand"
                        },
                        2 : {
                            title: "Delivered",
                            class: " m-badge--metal"
                        },
                        3 : {
                            title: "Canceled",
                            class: " m-badge--primary"
                        },
                        4 : {
                            title: "Success",
                            class: " m-badge--success"
                        },
                        5 : {
                            title: "Info",
                            class: " m-badge--info"
                        },
                        6 : {
                            title: "Danger",
                            class: " m-badge--danger"
                        },
                        7 : {
                            title: "Warning",
                            class: " m-badge--warning"
                        }
                    };
                    return '<span class="m-badge ' + e[t.Status].class + ' m-badge--wide">' + e[t.Status].title + "</span>"
                }
            },
            {
                field: "Type",
                title: "Type",
                width: 100,
                template: function(t) {
                    var e = {
                        1 : {
                            title: "Online",
                            state: "danger"
                        },
                        2 : {
                            title: "Retail",
                            state: "primary"
                        },
                        3 : {
                            title: "Direct",
                            state: "accent"
                        }
                    };
                    return '<span class="m-badge m-badge--' + e[t.Type].state + ' m-badge--dot"></span>&nbsp;<span class="m--font-bold m--font-' + e[t.Type].state + '">' + e[t.Type].title + "</span>"
                }
            },
            {
                field: "Actions",
                width: 110,
                title: "Actions",
                sortable: !1,
                overflow: "visible",
                template: function(t, e, a) {
                    return '\t\t\t\t\t\t<div class="dropdown ' + (a.getPageSize() - e <= 4 ? "dropup": "") + '">\t\t\t\t\t\t\t<a href="#" class="btn m-btn m-btn--hover-accent m-btn--icon m-btn--icon-only m-btn--pill" data-toggle="dropdown">                                <i class="la la-ellipsis-h"></i>                            </a>\t\t\t\t\t\t  \t<div class="dropdown-menu dropdown-menu-right">\t\t\t\t\t\t    \t<a class="dropdown-item" href="#"><i class="la la-edit"></i> Edit Details</a>\t\t\t\t\t\t    \t<a class="dropdown-item" href="#"><i class="la la-leaf"></i> Update Status</a>\t\t\t\t\t\t    \t<a class="dropdown-item" href="#"><i class="la la-print"></i> Generate Report</a>\t\t\t\t\t\t  \t</div>\t\t\t\t\t\t</div>\t\t\t\t\t\t<a href="#" class="m-portlet__nav-link btn m-btn m-btn--hover-accent m-btn--icon m-btn--icon-only m-btn--pill" title="Edit details">\t\t\t\t\t\t\t<i class="la la-edit"></i>\t\t\t\t\t\t</a>\t\t\t\t\t\t<a href="#" class="m-portlet__nav-link btn m-btn m-btn--hover-danger m-btn--icon m-btn--icon-only m-btn--pill" title="Delete">\t\t\t\t\t\t\t<i class="la la-trash"></i>\t\t\t\t\t\t</a>\t\t\t\t\t'
                }
            }]
        })
    }
};
jQuery(document).ready(function() {
    DefaultDatatableDemo.init()
});